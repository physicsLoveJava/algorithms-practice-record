package soup.impl.hackerrank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import soup.impl.DefaultClassGenerator;
import soup.support.ClassBean;
import soup.support.ClassGenerator;
import soup.support.ProblemResolver;
import util.ChromeUtil;
import util.StringUtil;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static util.ChromeUtil.takeScreenShot;
import static util.ImageUtil.doMerge;

public class HackerRankProblemResolver implements ProblemResolver {

    private static final Pattern PROBLEM_REG = Pattern.compile("([a-zA-Z\\-]+)/problem$");

    private static final String rootDir = "src/main/resources/hackerrank/";

    private static final String packageDir = "hackerrank";

    private static final ClassGenerator generator = new DefaultClassGenerator();

    public void resolve(String type, String url) {
        Matcher matcher = PROBLEM_REG.matcher(url);
        if(matcher.find()) {
            String problem = matcher.group(1);
            String problemDir = rootDir + type + File.separator + problem + File.separator;
            doMerge(takeScreenShot(url, problemDir, new ChromeUtil.WebAction() {
                public void invoke(WebDriver driver) {
                    WebElement $close = driver.findElement(By.className("close"));
                    $close.click();
                }
            }),  problemDir, "complete.png");
            generator.generate(constructClassBean(url, type, problem), true);
        }
        System.out.println("handled: " + url);
    }

    private ClassBean constructClassBean(String url, String type, String problem) {
        ClassBean bean = new ClassBean();
        bean.setPackageName(packageDir + File.separator + StringUtil.toClassName(type, "-"));
        bean.setClassName(StringUtil.toClassName(problem, "-"));
        bean.setClassComment("Problem Url: " + url);
        return bean;
    }
}
