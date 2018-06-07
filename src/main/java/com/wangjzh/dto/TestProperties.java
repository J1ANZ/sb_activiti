package com.wangjzh.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by 01435743 on 2018/5/16.
 */
@Component
public class TestProperties {

    @Value("${com.wangjzh.blog.name}")
    private String name;

    @Value("${com.wangjzh.title}")
    private String title;

    @Value("${com.wangjzh.des}")
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
