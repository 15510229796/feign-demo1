package com.jk.service.test;

import com.jk.model.test.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface ResumeService  {
    ArrayList<Reume> getInformation(Integer id);

    ArrayList<Educationexperience> getEducationexperience(Integer id);

    ArrayList<Skills> getSkills(Integer id);

    ArrayList<Workexperience> getWorkexperience(Integer id);

    ArrayList<Project> getProject(Integer id);
}
