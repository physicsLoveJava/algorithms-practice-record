package soup.impl.leetcode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import soup.support.UrlListFetcher;
import util.ChromeUtil;

import java.util.ArrayList;
import java.util.List;


public class LeetCodeFetcher implements UrlListFetcher {

    private static final String DOMAIN = "https://leetcode.com";

    private static final String TEMPL = DOMAIN + "/problemset/all/?difficulty=%s";

    private LeetCodeLevel level;

    private List<String> urlList;

    public LeetCodeFetcher(LeetCodeLevel level) {
        this.level = level;
        this.urlList = new ArrayList<String>();
        init();
    }

    private void init() {
        String typeUrl = String.format(TEMPL, level.getLevel());
        Document root = Jsoup.parse(ChromeUtil.getHtml(typeUrl, ".reactable-data", new ChromeUtil.WebAction() {
            public void invoke(WebDriver driver) {
                WebElement selectElement = driver.findElement(By.cssSelector("#question-app .reactable-pagination > tr > td > span.row-selector > select"));
                Select select = new Select(selectElement);
                select.selectByIndex(3);
            }
        }));
        Elements questions = root.select("#question-app tbody.reactable-data > tr > td:nth-child(3) > div > a");
        for (Element question : questions) {
            urlList.add(DOMAIN + question.attr("href"));
        }
    }

    public List<String> fetch() {
        System.out.println("urlList: " + urlList);
        return urlList;
    }
}
