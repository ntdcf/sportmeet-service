package com.SportMeet.Service.Controller;

import com.SportMeet.Service.API.ServerAPI;
import com.SportMeet.Service.API.UserSessionContext;
import com.SportMeet.Service.API.UserSessionListener;
import com.SportMeet.Service.Interface.UserInterface;
import com.SportMeet.Service.Model.Empty.User;
import com.SportMeet.Service.Service.BothService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import javax.servlet.http.HttpSessionListener;

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
        JSONObject userjson = new JSONObject(BothService.getJson(userinfo));
        User user = new User();
        user.setId(userjson.getInt("id"));
        user.setCollage(userjson.getInt("collage"));
        user.setGrade(userjson.getInt("grade"));
        user.setClassin(userjson.getInt("classin"));
        user.setInternetname(userjson.getString("internetname"));
        if (userDo.editUser(user) !=0) return "1";
        return "0";
    }
}
