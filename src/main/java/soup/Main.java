package soup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Document document = null;
        try {
            document = Jsoup.connect("https://www.hackerrank.com/domains/algorithms/greedy").get();
            Elements elements = document.select("#contest-challenges-problem > div > header > div > h4 > a");
            for (Element element : elements) {
                String href = element.attr("href");
                System.out.println(href);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
