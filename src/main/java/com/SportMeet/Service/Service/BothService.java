package com.SportMeet.Service.Service;

import com.SportMeet.Service.Model.Empty.Result;
import com.google.gson.Gson;

/**
 * Created by luohao on 2017/4/3.
 */
public class BothService {
    public static final int SUCCESS = 1;
    public static final int FAILS = 0;

    public static String getJson(String data) {
        return data.substring(data.indexOf("{"), data.length());
    }

    public static String getResult(Result result) {
        return new Gson().toJson(result);
    }
}
