package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.ActivityInterface;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        List activities = activityDo.getIndexActivity();
        JSONObject actjson = new JSONObject(activities);
        System.out.println(actjson.toString());
//        System.out.println("aaaa");
        return "";
    }
}
