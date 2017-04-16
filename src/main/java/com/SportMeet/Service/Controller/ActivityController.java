package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.ActivityInterface;
import com.SportMeet.Service.Model.Empty.Activity;
import com.SportMeet.Service.Model.Empty.SignUp;
import com.SportMeet.Service.Service.BothService;
import com.google.gson.Gson;
import jdk.nashorn.internal.runtime.JSONListAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luohao3 on 2017/3/20.
 */
@Controller
public class ActivityController {
    @Autowired
    ActivityInterface activityDo;

    @RequestMapping(value = "activity")
    public String indexActivity() {
        return "activity";
    }

    @RequestMapping(value = "getMsg")
    @ResponseBody
    public String index() {
        List<Activity> activities = activityDo.getIndexActivity();
        JSONArray actjson = new JSONArray(activities);
        return actjson.toString();
    }

    @RequestMapping(value = "signup")
    @ResponseBody
    public String signupActivity(@RequestBody String signupInfo) {
        SignUp signUp = new Gson().fromJson(BothService.getJson(signupInfo), SignUp.class);
        if (activityDo.addSignUp(signUp) == 0) {
            return "0";
        }
        return "1";
    }
}
