package com.bsj.controller;


import com.bsj.beans.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app")
@RestController
public class AppController {

    private static final Logger logger = LoggerFactory.getLogger(AppController.class);

    //demo请求
    @RequestMapping("/hello")
    public ResultBean hello(){

        return new ResultBean("hello world");
    }


    //请求出现异常





}
