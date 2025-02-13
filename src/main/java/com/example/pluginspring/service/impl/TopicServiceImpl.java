package com.example.pluginspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.pluginspring.entry.ChapterTable;
import com.example.pluginspring.entry.TopicTable;
import com.example.pluginspring.mapper.ChapterTableMapper;
import com.example.pluginspring.mapper.TopicTableMapper;
import com.example.pluginspring.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    ChapterTableMapper tableMapper;

    @Autowired
    TopicTableMapper topicTableMapper;


    @Override
    public List<ChapterTable> queryChapterList() {
        List<ChapterTable> chapterTables = tableMapper.selectList(new QueryWrapper<ChapterTable>().eq("level", "0"));
        for (ChapterTable table : chapterTables) {
            List<ChapterTable> chapterTableList = tableMapper.selectList(new QueryWrapper<ChapterTable>().eq("parent_id", table.getChapterId()));
            table.setChapterTables(chapterTableList);
        }
        return chapterTables;
    }

    @Override
    public List<TopicTable> queryTopicList(String chapterId) {
        List<TopicTable> topicTablePage = topicTableMapper.queryTopicList(chapterId);
        for (TopicTable table : topicTablePage) {
            table.getOptionData().forEach(e -> {
                if (StringUtils.isNotEmpty(table.getOptionId()) && table.getOptionId().equals(e.getOptionId())) {
                    e.setAnswer(true);
                }
            });
        }
        return topicTablePage;
    }
}
