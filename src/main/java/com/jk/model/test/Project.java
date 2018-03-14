package com.jk.model.test;

import java.io.Serializable;

public class Project implements Serializable {

    private Integer id;

    private Integer rid;

    private  String title;

    private  String developmentEnvironment;

    private  String projectFramework;

    private  String projectDescription;

    private  String jobDuty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDevelopmentEnvironment() {
        return developmentEnvironment;
    }

    public void setDevelopmentEnvironment(String developmentEnvironment) {
        this.developmentEnvironment = developmentEnvironment;
    }

    public String getProjectFramework() {
        return projectFramework;
    }

    public void setProjectFramework(String projectFramework) {
        this.projectFramework = projectFramework;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getJobDuty() {
        return jobDuty;
    }

    public void setJobDuty(String jobDuty) {
        this.jobDuty = jobDuty;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", rid=" + rid +
                ", title='" + title + '\'' +
                ", developmentEnvironment='" + developmentEnvironment + '\'' +
                ", projectFramework='" + projectFramework + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", jobDuty='" + jobDuty + '\'' +
                '}';
    }
}
