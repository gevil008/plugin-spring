package com.example.pluginspring.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pluginspring.entry.TopicTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TopicTableMapper extends BaseMapper<TopicTable> {

    List<TopicTable> queryTopicList(String chapterId);

}