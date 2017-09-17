package soup.impl.hackerrank;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import soup.support.UrlListFetcher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HackerRankFetcher implements UrlListFetcher {

    private String domain = "https://www.hackerrank.com";

    private String urlPrefix = "/domains/algorithms/";

    private List<String> urlList;

    private List<String> pageList;

    private String type;

    public HackerRankFetcher(String type) {
        this.type = type;
        this.urlList = new ArrayList<String>();
        this.pageList = new ArrayList<String>();
        init();
    }

    private void init() {
        try {
            String typeUrl = getTypeUrl(type);
            System.out.println(typeUrl);
            Document root = Jsoup.connect(typeUrl).get();
            Elements pageElement = root.select("#content div.pagination-wrapper li.page-item > a");
            for (Element page : pageElement) {
                pageList.add(page.attr("href"));
            }
            System.out.println(pageList);
            getProblemSetByEachPage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getProblemSetByEachPage() {
        for (String pageUrl : pageList) {
            try {
                Document root = Jsoup.connect(getLinkUrl(pageUrl)).get();
                Elements pSet = root.select("#contest-challenges-problem > div > header > div > h4 > a");
                for (Element p : pSet) {
                    urlList.add(getProblemUrl(p.attr("href")));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String getProblemUrl(String href) {
        return domain + href + "/problem";
    }

    private String getLinkUrl(String pageUrl) {
        return domain + pageUrl;
    }

    private String getTypeUrl(String type) {
        return domain + urlPrefix + type;
    }

    public List<String> fetch() {
        System.out.println("current list: " + urlList.size());
        return urlList;
    }
}
