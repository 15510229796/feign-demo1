package com.jk.service.test;

import com.jk.mapper.ResumeMapper;
import com.jk.model.test.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeMapper resumeMapper;

    @Override
    public ArrayList<Reume> getInformation(Integer id) {
        return resumeMapper.getInformation(id);
    }

    @Override
    public ArrayList<Educationexperience> getEducationexperience(Integer id) {
        return resumeMapper.getEducationexperience(id);
    }

    @Override
    public ArrayList<Skills> getSkills(Integer id) {
        return resumeMapper.getSkills(id);
    }

    @Override
    public ArrayList<Workexperience> getWorkexperience(Integer id) {
        return resumeMapper.getWorkexperience(id);
    }

    @Override
    public ArrayList<Project> getProject(Integer id) {
        return resumeMapper.getProject(id);
    }
}
