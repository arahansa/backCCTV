package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by arahansa on 2016-04-02.
 */
@Slf4j
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        log.debug("hello world");
        return "index";
    }

    


}
