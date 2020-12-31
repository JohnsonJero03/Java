package com.courseEx.firstex.course;

import com.courseEx.firstex.topics.topicsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class courseListController {

    @Autowired
    private courseService courseService;
    @RequestMapping("/listtopics/{id}/course")
    public List<courseList> listCourse(@PathVariable String id)
    {
        return courseService.getAllCourses(id) ;
    }

    @RequestMapping("/listtopics/{topicid}/course/{id}")
    public courseList getTopic(@PathVariable String id)
    {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topic/{id}/course")
    public void addTopic(@RequestBody courseList courseList,@PathVariable String id)
    {
        System.out.println(courseList);
        courseList.setTopicsList(new topicsList(id,"",""));
        courseService.addCourse(courseList);
    }
    @RequestMapping(method =RequestMethod.PUT,value = "/topic/{topicId}/course/{id}")
    public void updateTopic(@RequestBody courseList courseList, @PathVariable String topicId,@PathVariable String id)
    {
       courseService.updateCourse(courseList);
    }

//    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteTopic/{id}")
//    public void deleteTopic(@RequestBody topicsList topicsList ,@PathVariable String id)
//    {
//        topicService.deleteTopic(topicsList,id);
//    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topic/{topicId}/course/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        courseService.deleteCourse(id);
    }
}
