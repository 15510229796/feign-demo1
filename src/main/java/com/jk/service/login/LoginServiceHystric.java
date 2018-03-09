package com.jk.service.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class LoginServiceHystric implements LoginService {
    @Override
    public void save(String log) {
        System.out.println("微服务挂掉了，断路器启用");
    }
}
