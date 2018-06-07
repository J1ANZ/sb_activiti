package com.wangjzh.business.domain;

import java.io.Serializable;

/**
 * @description 工作流部署信息bean
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-5 13:40:20
 */
public class ActivitiDeployment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;//已发布工作流ID

    private String name;//已发布工作流name

    private String resourceName;//对应的表中的row_id

    private String deployTime;//工作流发布时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getDeployTime() {
        return deployTime;
    }

    public void setDeployTime(String deployTime) {
        this.deployTime = deployTime;
    }

}
