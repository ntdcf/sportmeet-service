package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.UserInterface;
import com.SportMeet.Service.Model.Empty.User;
import com.SportMeet.Service.Service.BothService;
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
        data = BothService.getJson(data);
        JSONObject regdata = new JSONObject(data);
        User user = new User();
        user.setRailname(regdata.getString("railname"));
        user.setUsername(regdata.getString("username"));
        user.setPassword(regdata.getString("password"));
        System.out.println(user);
        if (userDo.addUser(user)) {
            return "1";
        }
        return "0";
    }
}
