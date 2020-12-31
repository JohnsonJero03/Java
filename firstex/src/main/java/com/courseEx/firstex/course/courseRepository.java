package com.courseEx.firstex.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface courseRepository extends CrudRepository<courseList,String> {


   public List<courseList>  findBytopicsListId(String topicId);
}
