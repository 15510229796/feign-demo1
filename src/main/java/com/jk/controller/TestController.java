package com.jk.controller;


import com.jk.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.util.UUID;

import static com.jk.controller.ZXingCode.drawLogoQRCode;

@Controller
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "toIndex")
    public String toIndex(Model model){
      int count = testService.getCount();
        System.out.println(count);
        File logoFile = new File("G:\\photo\\1.jpg");
        File QrCodeFile = new File("F:\\apache-tomcat-erweima\\webapps\\ROOT\\"+ UUID.randomUUID().toString()+".jpg");
        String url = "http://192.168.0.123:8763/getInformation.do";
        String note = "高帅";
        drawLogoQRCode(logoFile, QrCodeFile, url, note);
        String path="http://127.0.0.1:8094/"+QrCodeFile.getName();
        model.addAttribute("path",path);
      return "test";
    }

    @RequestMapping(value = "toShowCode")
    public String toShowCode(){
        return "showCode";
    }

}
