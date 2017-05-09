package com.SportMeet.Service.Controller;

import com.SportMeet.Service.Interface.MsgInterface;
import com.SportMeet.Service.Interface.UserInterface;
import com.SportMeet.Service.Model.Empty.Msg;
import com.SportMeet.Service.Model.Empty.Result;
import com.SportMeet.Service.Service.BothService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by luohao on 2017/5/9.
 */
@Controller
public class SendMsgController {
    @Autowired
    MsgInterface MsgDo;
    @Autowired
    UserInterface UserDo;

    @RequestMapping(value = "sendmsg")
    public String index(@RequestParam("user")String user, Model model) {
        List<Msg> list = MsgDo.getToYestMsg();
        model.addAttribute("msg", list);
        model.addAttribute("userid", user);
        return "sendmsg";
    }

    @RequestMapping(value = "sendtomsg")
    @ResponseBody
    public String create(@RequestBody String msginfo) {
        Msg msg = new Gson().fromJson(msginfo, Msg.class);
        msg.setTime((int) (new Date().getTime()/1000));
        if (MsgDo.addMsg(msg)) {
            return new Result<Object>(BothService.SUCCESS, true, "添加成功", null).toString();
        }
        return new Result<Object>(BothService.FAILS, false, "添加失败", null).toString();
    }

    @RequestMapping(value = "sendtomsg2")
    public String addmsg(Msg msg, Model model) {
        msg.setTime((int) (new Date().getTime()/1000));
        MsgDo.addMsg(msg);


        return "redirect:sendmsg?user="+msg.getUser();
    }

}
