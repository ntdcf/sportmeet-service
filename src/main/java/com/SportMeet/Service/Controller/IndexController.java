package com.SportMeet.Service.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by luohao3 on 2017/3/19.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "logout.do")
    @ResponseBody
    public void outUser(HttpSession session, Model model) {
        session.removeAttribute("User");
    }
}
