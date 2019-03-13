package com.ssh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by Evin
 * On 2/1/2017.12:36 AM
 */
@Controller
public class MainController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        System.out.println("进来了");
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        return "/test";
    }
}