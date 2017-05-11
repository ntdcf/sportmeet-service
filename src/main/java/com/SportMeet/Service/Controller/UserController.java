package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.UserInterface;
import com.SportMeet.Service.Model.Empty.User;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luohao3 on 2017/2/3.
 */
@Controller
public class UserController {
    @Autowired
    private UserInterface userDo;

    @RequestMapping(value = "edituser")
    @ResponseBody
    public String editUser(@RequestBody String userinfo) {
        System.out.println(userinfo);
        Gson usergson = new Gson();
        User user = usergson.fromJson(userinfo, User.class);
        if (userDo.editUser(user) !=0) return "1";
        return "0";
    }

    @RequestMapping(value = "usercollage")
    @ResponseBody
    public String setUserCollage() {
        JSONArray res = new JSONArray(userDo.getCollage());
        return res.toString();
    }

    @RequestMapping(value = "getuser")
    @ResponseBody
    public String getUser(@RequestBody String userinfo) {
        User user = userDo.findUser(new Gson().fromJson(userinfo, User.class).getUsername());
        return new Gson().toJson(user);
    }
}
