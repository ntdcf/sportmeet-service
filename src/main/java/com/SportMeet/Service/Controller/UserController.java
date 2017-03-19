package com.SportMeet.Service.Controller;

import com.SportMeet.Service.API.ServerAPI;
import com.SportMeet.Service.API.UserSessionContext;
import com.SportMeet.Service.API.UserSessionListener;
import org.json.JSONObject;
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

//    @RequestMapping(value = "login", method = RequestMethod.POST)
//    @ResponseBody
//    public String loginUser(@RequestBody String LoginInfo, HttpSession session) {
//        JSONObject LoginData = new JSONObject(LoginInfo);
//        String username = LoginData.getString("username");
//        String password = LoginData.getString("password");
//        session.setAttribute("user","username");
//        System.out.println(LoginData.getString("username"));
//        return ServerAPI.getReturn("登录成功", 200, session.getId());
//    }

//    @RequestMapping(value = "reg", method = RequestMethod.POST)
//    @ResponseBody
//    public String regUser(@RequestBody String RegInfo, HttpSession session) {
//        JSONObject RegData = new JSONObject(RegInfo);
//        String username = RegData.getString("username");
//        String password = RegData.getString("password");
//        session.setAttribute("user","username");
//        System.out.println(RegInfo);
//        return ServerAPI.getReturn("注册成功", 200, session.getId());
//    }
//
//    @RequestMapping(value = "getsession", method = RequestMethod.POST)
//    @ResponseBody
//    public String sessionUser(@RequestBody String sessionId, HttpServletRequest request) {
//        HttpSession session = UserSessionContext.getSession(sessionId);
//        if (session == null) {
//            return ServerAPI.getReturn("nosession", 104, "nosession");
//        }
//        return ServerAPI.getReturn("session", 102, new JSONObject(session).toString());
//    }
}
