package com.SportMeet.Service.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luohao3 on 2017/2/3.
 */
@Controller
public class TestController {
    @RequestMapping(value = "index")
    @ResponseBody
    public String test() {
        return "hello";
    }
}