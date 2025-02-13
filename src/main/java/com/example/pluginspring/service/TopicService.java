package com.example.pluginspring.service;


import com.example.pluginspring.entry.ChapterTable;
import com.example.pluginspring.entry.TopicTable;

import java.util.List;

public interface TopicService {

    List<ChapterTable> queryChapterList();

    List<TopicTable> queryTopicList(String chapterId);
}
