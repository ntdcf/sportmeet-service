package com.SportMeet.Service.Service;

import com.SportMeet.Service.Model.Empty.Weather;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * Created by luohao3 on 2017/4/25.
 */
public class WeatherSpServer {
    //中国天气网的URL
    public static final String weatherUrl = "http://www.nmc.cn/publish/forecast/ASN/changan.html";

    //获取整个页面的DOM
    public Document getWebsitDocument(String url) {
        String agent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36";
        Document document = null;
        try {
            document = Jsoup.connect(url).userAgent(agent).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }

    //获取天气信息
    public Weather setWeather(Document document) {
        Element Today = document.getElementsByClass("today").get(0);

        Weather weather = new Weather();

        weather.setWeather(Today.getElementsByClass("wdesc").get(0).text());
        weather.setTempche(Today.getElementsByClass("temp").get(0).text());
        weather.setDirect(Today.getElementsByClass("direct").get(0).text());
        weather.setPower(Today.getElementsByClass("power").get(0).text());
        weather.setImage(Today.getElementsByTag("img").get(0).attr("src"));

        return weather;
    }
}
