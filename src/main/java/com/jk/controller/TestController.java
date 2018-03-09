package com.jk.controller;


import com.jk.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "toIndex")
    public String toIndex(){
      int count = testService.getCount();
        System.out.println(count);
      return "test";
    }

}
