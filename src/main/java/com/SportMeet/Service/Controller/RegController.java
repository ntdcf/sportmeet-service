package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.UserInterface;
import com.SportMeet.Service.Model.Empty.Result;
import com.SportMeet.Service.Model.Empty.User;
import com.SportMeet.Service.Service.BothService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luohao on 2017/4/3.
 */
@Controller
public class RegController {
    @Autowired
    UserInterface userDo;

    @RequestMapping(value = "reg")
    @ResponseBody
    public String index(@RequestBody String data) {
        User user = new Gson().fromJson(data, User.class);
//        String json = new Result<User>(1, true, "userinfo", user).toString();
//        Result<User> res = new Gson().fromJson(json, new TypeToken<Result<User>>(){}.getType());
//        System.out.println(res);
        if (userDo.addUser(user)) {
            return "1";
        }
        return "0";
    }
}
