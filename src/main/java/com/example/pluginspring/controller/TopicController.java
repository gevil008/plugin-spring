package com.example.pluginspring.controller;

import com.example.pluginspring.entry.ChapterTable;
import com.example.pluginspring.entry.TopicTable;
import com.example.pluginspring.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/queryChapterList")
    public List<ChapterTable> queryChapterList() {
        return topicService.queryChapterList();
    }

    @GetMapping("/queryTopicList/{chapterId}")
    public List<TopicTable> queryTopicList(@PathVariable("chapterId") String chapterId) {
        return topicService.queryTopicList(chapterId);
    }

}
