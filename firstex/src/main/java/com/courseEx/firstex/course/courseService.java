package com.courseEx.firstex.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class courseService {

    @Autowired
    private courseRepository courseRepository;


    public List<courseList> getAllCourses(String id)
    {
        List<courseList> courseLists = new ArrayList<>();
        courseRepository.findBytopicsListId(id)
        .forEach(courseLists::add);
        return courseLists;
    }

    public courseList getCourse(String id)
    {
        return courseRepository.findById(id).get();
//        return listOfTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addCourse(courseList courseList) {
        courseRepository.save(courseList);
    }

    public void updateCourse(courseList courseList) {
        courseRepository.save(courseList);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }



}
