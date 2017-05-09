package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.ActivityInterface;
import com.SportMeet.Service.Model.Empty.Activity;
import com.SportMeet.Service.Model.Empty.Result;
import com.SportMeet.Service.Model.Empty.SignUp;
import com.SportMeet.Service.Model.Empty.User;
import com.SportMeet.Service.Service.BothService;
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

    @RequestMapping(value = "getMsg")
    @ResponseBody
    public String index() {
        List<Activity> activities = activityDo.getIndexActivity();
        return new Result<List<Activity>>(
                BothService.SUCCESS,
                true,
                "获取所有项目成功",
                activities
        ).toString();
    }

    @RequestMapping(value = "signup")
    @ResponseBody
    public String signupActivity(@RequestBody String signupInfo) {
        SignUp signUp = new Gson().fromJson(signupInfo, SignUp.class);
        if (activityDo.addSignUp(signUp) == 0) {
            return new Result<Object>(
                    0,
                    false,
                    "添加数据库失败",
                    null
            ).toString();
        }
        return new Result<Object>(
                BothService.SUCCESS,
                true,
                "添加数据库成功",
                null
        ).toString();
    }

    @RequestMapping(value = "issignup")
    @ResponseBody
    public String isSignup(@RequestBody String signupInfo) {
        SignUp signUp = new Gson().fromJson(signupInfo, SignUp.class);
        int res = activityDo.getSignUpCount(signUp);
        if (res == 0) {
            return new Result<Integer>(
                    BothService.SUCCESS,
                    true,
                    "该用户尚未报名",
                    res
            ).toString();
        }
        return new Result<Integer>(
                BothService.SUCCESS,
                false,
                "该用户已经报名",
                res
        ).toString();
    }

    @RequestMapping(value = "countact")
    @ResponseBody
    public String getCountUserSign(@RequestBody String user) {
        User userinfo = new Gson().fromJson(user, User.class);
        int id = userinfo.getId();
        return new Result<Integer>(
                BothService.SUCCESS,
                true,
                "用户报名数量",
                activityDo.getSignUpCount(id)
        ).toString();
    }

    @RequestMapping(value = "searchact")
    @ResponseBody
    public String search(@RequestBody String activity) {
        Activity actMsg = new Gson().fromJson(activity, Activity.class);
        String name = actMsg.getMsg();
        name = "%"+name+"%";
        actMsg.setMsg(name);
        List<Activity> list = activityDo.getActivity(actMsg);
        return new Result<List<Activity>>(
                BothService.SUCCESS,
                true,
                "模糊查询成功",
                list
        ).toString();
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

        return new Result<List<Activity>>(BothService.SUCCESS, true, "获取该用户报名项目成功", ResAct).toString();
    }

    @RequestMapping(value = "unsign")
    @ResponseBody
    public String unSignUp(@RequestBody String Info) {
        SignUp signUp = new Gson().fromJson(Info, SignUp.class);
        int res = activityDo.deleteSignUp(signUp);
        if (res != 0)
            return new Result<Object>(
                    BothService.SUCCESS,
                    true,
                    "删除用户报名数据成功",
                    null
            ).toString();
        return new Result<Object>(
                BothService.FAILS,
                false,
                "删除用户数据失败",
                null
        ).toString();
    }
}
