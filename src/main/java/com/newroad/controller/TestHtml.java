
package com.newroad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHtml {
    @RequestMapping("helloindex")
    public String hello(){
        return "hello";

    }
}
