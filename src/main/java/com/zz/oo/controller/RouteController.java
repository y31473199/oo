package com.zz.oo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {
    @RequestMapping("index.html")
    public String goIndex(){
        return "index";
    }

}
