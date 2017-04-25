package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Model.Empty.Weather;
import com.SportMeet.Service.Service.WeatherSpServer;
import com.google.gson.Gson;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luohao3 on 2017/4/25.
 */

//天气信息获取
@Controller
public class WeatherController {
    WeatherSpServer weatherSpServer = new WeatherSpServer();

    @RequestMapping(value = "weather")
    @ResponseBody
    public String index() {
        Document weatherDoucment = weatherSpServer.getWebsitDocument(WeatherSpServer.weatherUrl);
        Weather weather = weatherSpServer.setWeather(weatherDoucment);
        return new Gson().toJson(weather);
    }

}
