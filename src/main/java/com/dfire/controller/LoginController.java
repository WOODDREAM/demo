package com.dfire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * User:huangtao
 * Date:2015-07-24
 * description：
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/user/Login",method = RequestMethod.POST)
    public ModelAndView login(String userName,String passWord){


        return new ModelAndView("user");
    }
}
