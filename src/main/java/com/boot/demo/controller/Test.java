package com.boot.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class Test {
    @RequestMapping("/test777")
    public String azaz(){
        log.info("test~!!!");
        return "test";
    }
}
