package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.UserInterface;
import com.SportMeet.Service.Model.Empty.User;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;

/**
 * Created by luohao3 on 2017/3/19.
 */
@Controller
public class IndexController {
    @Autowired
    UserInterface userDo;

    @RequestMapping(value = "logout.do")
    @ResponseBody
    public void outUser(HttpSession session, Model model) {
        session.removeAttribute("User");
    }

    @RequestMapping(value = "userindex")
    @ResponseBody
    public String getUserInfo(@RequestBody String username) {
        User user = userDo.findUser(username.substring(username.indexOf("0")));
        JSONObject userInfo = new JSONObject(user);
        return userInfo.toString();
    }
}
