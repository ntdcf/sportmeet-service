package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.UserInterface;
import com.SportMeet.Service.Model.Empty.User;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * Created by luohao3 on 2017/3/18.
 */
@Controller
public class LoginController {
    @Autowired
    UserInterface UserDo;

    @RequestMapping(value = "/")
    public String dispatcherIndex(HttpSession session, Model model) {
        User user = (User) session.getAttribute("User");
        if (user == null) {
            return "login";
        }
        model.addAttribute("user", user);
        return "index";
    }

    //ajax请求使用
    @RequestMapping(value = "index")
    public String toIndex(HttpSession session, Model model) {
        User user = (User) session.getAttribute("User");
        if (user == null) return "login";
        model.addAttribute("user", user);
        return "index";
    }

    @RequestMapping(value = "login")
    @ResponseBody
    public String loginUser(@RequestBody String data, HttpSession session) throws UnsupportedEncodingException {
        JSONObject UserLoginData = new JSONObject(data);
        String username = (String)UserLoginData.get("username");
        String password = (String)UserLoginData.get("password");
        User user = UserDo.findUser(username);
        System.out.println(user);
        if (user == null) return "0";
        if (user.getPassword().equals(password)) {
            session.setAttribute("User", user);
            return "1";
        }
        return "0";
    }



    @RequestMapping(value = "userinfo.do")
    public String getUserInfo() {
        return "userinfo";
    }


}
