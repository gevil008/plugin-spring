package com.example.pluginspring.entry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 选项表
 */
@TableName(value = "options_table")
public class OptionsTable implements Serializable {
    /**
     * 选项id
     */
    @TableId(value = "option_id", type = IdType.INPUT)
    private String optionId;

    /**
     * 选项名称
     */
    @TableField(value = "option_name")
    private String optionName;

    /**
     * 所属题目id
     */
    @TableField(value = "tppic_id")
    private String tppicId;

    /**
     * 图片名称
     */
    @TableField(value = "option_img")
    private String optionImg;

    @TableField(exist = false)
    private String optionImgUrl;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 是否答案
     */
    @TableField(exist = false)
    private boolean answer = false;

    private static final long serialVersionUID = 1L;

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getTppicId() {
        return tppicId;
    }

    public void setTppicId(String tppicId) {
        this.tppicId = tppicId;
    }

    public String getOptionImg() {
        return optionImg;
    }

    public void setOptionImg(String optionImg) {
        this.optionImg = optionImg;
    }

    public String getOptionImgUrl() {
        return optionImgUrl;
    }

    public void setOptionImgUrl(String optionImgUrl) {
        this.optionImgUrl = optionImgUrl;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}