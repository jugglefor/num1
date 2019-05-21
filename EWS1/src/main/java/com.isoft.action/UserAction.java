package com.isoft.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
    @RequestMapping("/login.do")
    @ResponseBody
    public String login(String uname,String upwd){
//        硬编码
        if (uname.equals("admin")&&upwd.equals("123456"))
            return "success";
        else
            return "fault";
//        System.out.println(uname+","+upwd);
//        return "../admin.html";
    }



    @RequestMapping("/register.do")
    @ResponseBody
    public String register(String r_uname,String r_upwd){
//        硬编码
        if (r_uname.equals("admin")&&r_upwd.equals("123456"))
            return "success";
        else
            return "fault";
//        System.out.println(uname+","+upwd);
//        return "../admin.html";
    }
}
