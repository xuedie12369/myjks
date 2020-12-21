package com.threeclear.myjks.com.threeclear.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestDemoController {
    @Autowired
    DemoController demoController;

    @Test
    void test1() {
        String test = demoController.test(1);

    }
}