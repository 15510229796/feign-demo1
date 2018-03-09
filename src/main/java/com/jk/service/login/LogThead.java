package com.jk.service.login;

import com.alibaba.fastjson.JSON;
import com.jk.model.log.LogBean;

public class LogThead implements Runnable {
  private LoginService loginService;
  private LogBean logBean;
    @Override
    public void run() {
        String log = JSON.toJSONString(logBean);
        loginService.save(log);
    }
    public LogThead() {

    }

    public LogThead(LoginService loginService, LogBean logBean) {
        this.loginService = loginService;
        this.logBean = logBean;
    }

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public LogBean getLogBean() {
        return logBean;
    }

    public void setLogBean(LogBean logBean) {
        this.logBean = logBean;
    }
}
