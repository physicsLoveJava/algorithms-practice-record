package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChromeUtil {

    public static double WINDOW_HEIGHT = 900.0;
    public static double SCROLL_BAR = 100;

    public static List<String> takeScreenShot(String url, String dest) {
        String path = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File(path)).usingAnyFreePort().build();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.setProperty("webdriver.chrome.driver", webDriverPath);
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement $close = driver.findElement(By.className("close"));
        $close.click();
        WebElement $wrapper = driver.findElement(By.id("wrapper"));
        int maxHeight = $wrapper.getSize().getHeight();
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
        service.stop();
        return list;
    }

    private static File takeScreenShot(WebDriver driver, double top, String path) {
        top = top < 0 ? 0 : top;
        String js = "var q = document.body.scrollTop=" + top;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript(js);
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
