package com.newroad.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/test")
public class TestHtml {
    @RequestMapping("/t1")
    public String hello(){
        return "manage/customer/list";
    }
}
