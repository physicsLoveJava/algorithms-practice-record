package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChromeUtilTest {
    @Test
    public void getHtml() throws Exception {
        System.out.println(ChromeUtil.getHtml("https://leetcode.com/problemset/all/?difficulty=Medium"));
    }

    @Test
    public void takeScreenShot() {
        ChromeUtil.takeScreenShot("http://www.baidu.com", "e://");
    }

}