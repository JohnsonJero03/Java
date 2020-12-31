package com.courseEx.firstex.course;

import com.courseEx.firstex.topics.topicsList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class courseList {
    @Id
    private String id;
    private String name;
    private String des;

    @ManyToOne
    private topicsList topicsList;
    public courseList() {

    }

    public courseList(String id, String name, String des,String topicId) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.topicsList = new topicsList(topicId,"","");
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

    public com.courseEx.firstex.topics.topicsList getTopicsList() {
        return topicsList;
    }

    public void setTopicsList(com.courseEx.firstex.topics.topicsList topicsList) {
        this.topicsList = topicsList;
    }

}
