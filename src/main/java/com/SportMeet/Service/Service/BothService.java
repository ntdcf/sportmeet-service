package com.SportMeet.Service.Service;

/**
 * Created by luohao on 2017/4/3.
 */
public class BothService {
    public static String getJson(String data) {
        return data.substring(data.indexOf("{"), data.indexOf("}")+1);
    }
}
