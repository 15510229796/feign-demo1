package com.jk.model.test;

import java.io.Serializable;

public class Skills implements Serializable {

    private Integer id;

    private Integer rid;

    private String  content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "id=" + id +
                ", rid=" + rid +
                ", content='" + content + '\'' +
                '}';
    }
}
