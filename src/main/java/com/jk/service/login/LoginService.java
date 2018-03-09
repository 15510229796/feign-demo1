package com.jk.service.login;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider-log",fallback = LoginServiceHystric.class)
@Service
public interface LoginService {
    @RequestMapping("/log/saveLog")
    void save(@RequestParam(value = "log") String log);
}
