package com.courseEx.firstex.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class topicService {

    @Autowired
    private topicRepository topicRepository;


    public List<topicsList> getAllTopics()
    {
        List<topicsList> topics = new ArrayList<>();
        topicRepository.findAll()
        .forEach(topics::add);
        return topics;
    }

    public  topicsList getTopic(String id)
    {
        return topicRepository.findById(id).get();
//        return listOfTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(topicsList topicsList) {
        topicRepository.save(topicsList);
    }

    public void updateTopic(topicsList topicsList, String id) {
        topicRepository.save(topicsList);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }



}
