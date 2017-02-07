package com.SportMeet.Service.API;

import org.apache.commons.logging.Log;
import org.json.JSONObject;

/**
 * Created by luohao3 on 2017/2/4.
 */
public class ServerAPI {
    //返回给客户端统一的形式
    public static String getReturn(String msg, int num, String data) {
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("msg", msg);
        jsonObject.put("num", num);
        jsonObject.put("data", data);
        return jsonObject.toString();
    }
}
