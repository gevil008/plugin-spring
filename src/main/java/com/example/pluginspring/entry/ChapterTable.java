package com.example.pluginspring.entry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.List;

/**
 * 章节表
 */
@TableName(value = "chapter_table")
public class ChapterTable implements Serializable {
    /**
     * 章节id
     */
    @TableId(value = "chapter_id", type = IdType.INPUT)
    private String chapterId;

    /**
     * 章节名称
     */
    @TableField(value = "chapter_name")
    private String chapterName;

    /**
     * 级别
     */
    @TableField(value = "`level`")
    private String level;

    /**
     * 父id
     */
    @TableField(value = "parent_id")
    private String parentId;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    @TableField(exist = false)
    private List<TopicTable> topicData;

    @TableField(exist = false)
    private List<ChapterTable> chapterTables;

    private static final long serialVersionUID = 1L;

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public List<TopicTable> getTopicData() {
        return topicData;
    }

    public void setTopicData(List<TopicTable> topicData) {
        this.topicData = topicData;
    }

    public List<ChapterTable> getChapterTables() {
        return chapterTables;
    }

    public void setChapterTables(List<ChapterTable> chapterTables) {
        this.chapterTables = chapterTables;
    }
}