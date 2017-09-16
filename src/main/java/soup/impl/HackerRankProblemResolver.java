package soup.impl;

import soup.support.ClassBean;
import soup.support.ClassGenerator;
import soup.support.ProblemResolver;
import util.StringUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static util.ChromeUtil.takeScreenShot;
import static util.ImageUtil.doMerge;

public class HackerRankProblemResolver implements ProblemResolver {

    private static final Pattern PROBLEM_REG = Pattern.compile("([a-zA-Z\\-]+)/problem$");

    private static final String rootDir = "src/main/resources/hackerrank/";

    private static final String packageDir = "hackerrank";

    static final ClassGenerator generator = new DefaultClassGenerator();

    public void resolve(String url) {
        Matcher matcher = PROBLEM_REG.matcher(url);
        if(matcher.find()) {
            String problem = matcher.group(1);
            String problemDir = rootDir + problem + "/";
            doMerge(takeScreenShot(url, problemDir),  problemDir, "complete.png");
            generator.generate(constructClassBean(url, problem), true);
        }
        System.out.println("handled: " + url);
    }

    private ClassBean constructClassBean(String url, String problem) {
        ClassBean bean = new ClassBean();
        bean.setPackageName(packageDir);
        bean.setClassName(StringUtil.toClassName(problem, "-"));
        bean.setClassComment("Problem Url: " + url);
        return bean;
    }
}
