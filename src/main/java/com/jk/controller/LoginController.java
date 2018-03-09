package com.jk.controller;

import com.jk.model.log.LogBean;
import com.jk.pool.ThreadPool;
import com.jk.service.login.LogThead;
import com.jk.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping(value = "login")
public class LoginController {
   @Autowired
    private LoginService loginService;
    /**
     * 登录
     * @param loginNumber
     * @param password
     * @return
     */
    @RequestMapping(value = "login")
    @ResponseBody
    public Boolean login(String loginNumber,String password){
        LogBean logBean = new LogBean();
        logBean.setIp("127.0.0.1");
        logBean.setIpAddress("局域网");
        logBean.setLog("登录测试"+ UUID.randomUUID().toString());
        logBean.setLogTime(new Date());
        logBean.setRequestMsg("loginNumber:"+loginNumber+"password:"+password);
        logBean.setResponseMsg("{'loginNumber':'admin','password':'admin'}");
        logBean.setName("login");
        //假如登录成功
        ThreadPool.executors(new LogThead(loginService,logBean));
       return true;
    }
}
