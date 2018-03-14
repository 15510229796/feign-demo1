package com.jk.controller;


import com.itextpdf.text.pdf.BaseFont;
import com.jk.model.test.*;
import com.jk.service.test.ResumeService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @RequestMapping(value = "getInformation")
    public  String getInformation()throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "展示列表");
        //去mysql数据库中查询
        Integer id=1;
        //查询用户信息
        ArrayList<Reume> users = resumeService.getInformation(id);
        ArrayList<Educationexperience> educationexperience = resumeService.getEducationexperience(id);
        ArrayList<Skills> skills = resumeService.getSkills(id);
        ArrayList<Workexperience> workexperience = resumeService.getWorkexperience(id);
        ArrayList<Project> project  = resumeService.getProject(id);
        map.put("project",project);
        map.put("skills",skills);
        map.put("userlist",users);
        map.put("educationexperience",educationexperience);
        map.put("workexperience",workexperience);
        //* 创建配置 *//*
        Configuration cfg = new Configuration();
        //* 指定模板存放的路径 *//*
        cfg.setDirectoryForTemplateLoading(new File("F:\\resume\\"));
        cfg.setDefaultEncoding("UTF-8");
        //* 从上面指定的模板目录中加载对应的模板文件 *//*
        Template temp = cfg.getTemplate("test.ftl");
        //* 将生成的内容写入hello .html中 *//*
        String file1 = "F:\\apache-tomcat-erweima\\webapps\\ROOT\\test.html";
        File file = new File(file1);
        if (!file.exists())
            file.createNewFile();
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), "UTF-8"));
        temp.process(map, out);
        out.flush();

        String url = new File(file1).toURI().toURL().toString();
        String outputFile = "F:\\apache-tomcat-erweima\\webapps\\ROOT\\test.pdf";
        OutputStream os = new FileOutputStream(outputFile);

        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(url);
        // 解决中文问题
        ITextFontResolver fontResolver = renderer.getFontResolver();
        try {
            //* simsun.ttc*//*
            fontResolver.addFont("F:\\apache-tomcat-erweima\\webapps\\ROOT\\wordFont\\simsun.ttc", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            //* fontResolver.addFont("D:\\freemarker\\wordFont\\simsun.ttc", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            fontResolver.addFont("F:\\apache-tomcat-erweima\\webapps\\ROOT\\wordFont\\simsun.ttc", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //* fontResolver.addFont("C:/Windows/Fonts/ARIALUNI.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);*//*
        renderer.layout();
        try {
            renderer.createPDF(os);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("转换成功!");
        os.close();
        return "test1";
    }
}
