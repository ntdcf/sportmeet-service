package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.ActivityInterface;
import com.SportMeet.Service.Model.Empty.Activity;
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
    public String showActivity() {
        String res = "";
        List<Activity> list = activityDo.getIndexActivity();
        for (Activity activity : list) {
            res += "<li><div data-role=\"controlgroup\" data-type=\"horizontal\" align=\"center\">"+activity.getMsg()+"</div></li>";
        }
        return res;
    }
}
