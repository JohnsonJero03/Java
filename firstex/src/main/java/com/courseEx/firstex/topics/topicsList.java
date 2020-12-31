package com.courseEx.firstex.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class topicsList {
    @Id
    private String id;
    private String name;
    private String des;

    public topicsList() {

    }

    public topicsList(String id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
