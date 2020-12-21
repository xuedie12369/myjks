package com.threeclear.myjks.com.threeclear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("test")
    public  String test(int i ) {
        if (i==1){
            System.out.println("情况1:");
        }  if (i==2){
            System.out.println("情况2:");
        }
        return "返回了测试的内容";
    }
}
