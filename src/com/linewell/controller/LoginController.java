package com.linewell.controller;

import com.linewell.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springMvc
 * @description: ${DESCRIPTION}
 * @author: Mr.Yu
 * @create: 2019-04-02 15:14
 **/

@Controller
public class LoginController {
    @RequestMapping("/showLogin")
    public String showLogin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(User user){
        if(user.getUsername().equals( "tom" ) && user.getPassword().equals( "1234565" )){
            return "success";
        }
        return "redirect:showLogin.action";
    }
}
