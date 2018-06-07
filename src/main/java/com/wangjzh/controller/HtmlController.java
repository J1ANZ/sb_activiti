package com.wangjzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/modelList")
    public String modelList(){
        return "redirect:/model-list.html";
    }
}
