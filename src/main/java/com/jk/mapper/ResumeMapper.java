package com.jk.mapper;

import com.jk.model.test.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface ResumeMapper {

    @Select("select * from t_resume where id=#{id}")
    ArrayList<Reume> getInformation(Integer id);

    @Select("select * from t_educationexperience where rid=#{id}")
    ArrayList<Educationexperience> getEducationexperience(Integer id);

    @Select("select * from t_skills where rid=#{id}")
    ArrayList<Skills> getSkills(Integer id);

    @Select("select * from t_workexperience where rid=#{id}")
    ArrayList<Workexperience> getWorkexperience(Integer id);

    @Select("select * from t_project where rid=#{id}")
    ArrayList<Project> getProject(Integer id);
}
