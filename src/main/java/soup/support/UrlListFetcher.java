package soup.support;

import java.util.List;

public interface UrlListFetcher {

    String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.91 Safari/537.36";

    List<String> fetch();

}
