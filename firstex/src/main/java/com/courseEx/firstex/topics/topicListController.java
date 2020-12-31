package com.courseEx.firstex.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController

public class topicListController {

    @Autowired
    private topicService topicService;
    @RequestMapping("/listtopics")
    public List<topicsList> listTopic()
    {
        return topicService.getAllTopics() ;
    }

    @RequestMapping("/listtopics/{id}")
    public topicsList getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/addTopic")
    public void addTopic(@RequestBody topicsList topicsList)
    {
        System.out.println(topicsList);
        topicService.addTopic(topicsList);
    }
    @RequestMapping(method =RequestMethod.PUT,value = "/updateTopic/{id}")
    public void updateTopic(@RequestBody topicsList topicsList, @PathVariable String id)
    {
       topicService.updateTopic(topicsList , id);
    }

//    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteTopic/{id}")
//    public void deleteTopic(@RequestBody topicsList topicsList ,@PathVariable String id)
//    {
//        topicService.deleteTopic(topicsList,id);
//    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deleterTopic/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }
}
