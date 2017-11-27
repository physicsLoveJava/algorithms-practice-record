package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChromeUtil {

    public interface WebAction {
        void invoke(WebDriver driver);
    }

    public static double WINDOW_HEIGHT = 900.0;
    public static double SCROLL_BAR = 100;
    public static long THREAD_SLEEP = 2000;
    public static int TIME_TO_SLEEP = 2000;

    public static String getHtml(String url) {
        return getHtml(url, TIME_TO_SLEEP, null, null);
    }

    public static String getHtml(String url, String waitElmentSelector) {
        return getHtml(url, TIME_TO_SLEEP, waitElmentSelector, null);
    }

    public static String getHtml(String url, WebAction action) {
        return getHtml(url, TIME_TO_SLEEP, null, action);
    }

    public static String getHtml(String url, String waitElementSelector, WebAction action) {
        return getHtml(url, TIME_TO_SLEEP, waitElementSelector, action);
    }

    public static String getHtml(String url, int timeToSleep, String waitElmentSelector, WebAction action) {
        String path = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File(path)).usingAnyFreePort().build();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebDriver driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(timeToSleep, TimeUnit.MILLISECONDS);
        if(waitElmentSelector != null) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(waitElmentSelector)));
        }
        if(action != null) {
            action.invoke(driver);
        }
        String html = driver.findElement(By.tagName("body")).getAttribute("innerHTML");
        try {
            Thread.sleep(THREAD_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
        service.stop();
        return html;
    }

    public static List<String> takeScreenShot(String url, String dest, WebAction action) {
        String path = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File(path)).usingAnyFreePort().build();
        try {
            try {
                service.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
            WebDriver driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
            driver.get(url);
//            driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            if(action != null) {
                action.invoke(driver);
            }
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            Long maxHeight = (Long) executor.executeScript("return document.body.scrollHeight");
            System.out.println("height: " + maxHeight);
            try {
                FileUtils.forceMkdir(new File(dest));
            } catch (IOException e) {
                e.printStackTrace();
                throw new IllegalStateException("failed to create directory", e);
            }
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < Math.ceil(maxHeight / WINDOW_HEIGHT); i++) {
                File destFile = takeScreenShot(driver, i * WINDOW_HEIGHT - SCROLL_BAR, dest + "/" + i + ".png");
                list.add(destFile.getAbsolutePath());
            }
            driver.quit();
            while (service.isRunning()) {
                try {
                    Thread.sleep(THREAD_SLEEP);
                    service.stop();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return list;
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(service.isRunning()) {
                service.stop();
            }
        }
        return null;
    }

    public static List<String> takeScreenShot(String url, String dest) {
        return takeScreenShot(url, dest, null);
    }

    private static File takeScreenShot(WebDriver driver, double top, String path) {
        top = top < 0 ? 0 : top;
        String js1 = "document.body.scrollTop=" + top;
        String js2 = "document.documentElement.scrollTop=" + top;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript(js1);
        executor.executeScript(js2);
        TakesScreenshot ssDriver = (TakesScreenshot) driver;
        File scrFile = ssDriver.getScreenshotAs(OutputType.FILE);
        try {
            File descFile = new File(path);
            FileUtils.copyFile(scrFile, descFile);
            return descFile;
        } catch (IOException e) {
            throw new IllegalStateException("failed to generate screen shot file", e);
        }
    }

}
