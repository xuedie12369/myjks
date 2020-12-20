package com.threeclear.myjks.com.threeclear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("test")
    public  String test() {
        return "返回了测试的内容";
    }
}
