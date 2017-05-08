package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.ActivityInterface;
import com.SportMeet.Service.Model.Empty.Activity;
import com.SportMeet.Service.Model.Empty.SignUp;
import com.SportMeet.Service.Model.Empty.User;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luohao3 on 2017/3/20.
 */
@Controller
public class ActivityController {
    private static final Logger logger = Logger.getLogger(ActivityController.class);

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
        SignUp signUp = new Gson().fromJson(signupInfo, SignUp.class);
        if (activityDo.addSignUp(signUp) == 0) {
            return "0";
        }
        return "1";
    }

    @RequestMapping(value = "issignup")
    @ResponseBody
    public String isSignup(@RequestBody String signupInfo) {
        SignUp signUp = new Gson().fromJson(signupInfo, SignUp.class);
        int res = activityDo.getSignUpCount(signUp);
        if (res == 0) {
            return "null";
        }
        return "isSignUp";
    }

    @RequestMapping(value = "countact")
    @ResponseBody
    public String getCountUserSign(@RequestBody String user) {
        User userinfo = new Gson().fromJson(user, User.class);
        int id = userinfo.getId();
        if (activityDo.getSignUpCount(id) >= 5) {
            return "maxup";
        }
        return "nomax";
    }

    @RequestMapping(value = "searchact")
    @ResponseBody
    public String search(@RequestBody String activity) {
        Activity actMsg = new Gson().fromJson(activity, Activity.class);
        String name = actMsg.getMsg();
        name = "%"+name+"%";
        actMsg.setMsg(name);
        List<Activity> list = activityDo.getActivity(actMsg);
        return new Gson().toJson(list);
    }

    @RequestMapping(value = "getact")
    @ResponseBody
    public String getSignUp(@RequestBody String UserInfo) {
        //返回该用户已经报名项目
        User user = new Gson().fromJson(UserInfo, User.class);
        List<SignUp> list = activityDo.getSignUp(user);
        List<Activity> activities = activityDo.getIndexActivity();

        Map<Integer, Activity> actMap = new HashMap<Integer, Activity>();
        List<Activity> ResAct = new ArrayList<Activity>();

        for (Activity a : activities) {
            actMap.put(a.getId(), a);
        }

        for (SignUp a : list) {
            ResAct.add(actMap.get(a.getActivityid()));
        }

        return new Gson().toJson(ResAct);
    }

    @RequestMapping(value = "unsign")
    @ResponseBody
    public String unSignUp(@RequestBody String Info) {
        SignUp signUp = new Gson().fromJson(Info, SignUp.class);
        int res = activityDo.deleteSignUp(signUp);
        if (res != 0) {
            return "true";
        }
        return "false";
    }
}
