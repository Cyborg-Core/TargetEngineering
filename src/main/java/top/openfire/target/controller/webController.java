package top.openfire.target.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class webController {
    @ResponseBody
    @RequestMapping("/index")
    public String homePage(){
        return "hello foundary";
    }
}
