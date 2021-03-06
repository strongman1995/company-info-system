package cn.thu.info.crawler.company;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;


public abstract class CompanyProcessor implements PageProcessor {
    private Site site = Site
            .me()
            .setTimeOut(5000)
            .setSleepTime(800)
            .setRetryTimes(Integer.MAX_VALUE)
            .setCycleRetryTimes(Integer.MAX_VALUE)
            .setUserAgent(
                    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2)" +
                            " AppleWebKit/537.31 (KHTML, like Gecko) Chrome" +
                            "/26.0.1410.65 Safari/537.31");
    @Override
    public Site getSite() {
        return site;
    }

    public abstract String getSource();

    public abstract void work(int startId);
}
