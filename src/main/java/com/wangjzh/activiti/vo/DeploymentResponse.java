package com.wangjzh.activiti.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.activiti.engine.repository.Deployment;
import org.activiti.rest.common.util.DateToStringSerializer;

import java.util.Date;


/**
 * @description 流程图部署信息数据对象
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-7 00:45:09
 */
public class DeploymentResponse {

  private String id;
  private String name;
  @JsonSerialize(using = DateToStringSerializer.class, as=Date.class)
  private Date deploymentTime;
  private String category;
  private String tenantId;
  
  public DeploymentResponse(Deployment deployment) {
    setId(deployment.getId());
    setName(deployment.getName());
    setDeploymentTime(deployment.getDeploymentTime());
    setCategory(deployment.getCategory());
    setTenantId(deployment.getTenantId());
  }
  
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
  public  Date getDeploymentTime() {
    return deploymentTime;
  }
  public void setDeploymentTime( Date deploymentTime) {
    this.deploymentTime = deploymentTime;
  }
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }
  public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
  }
  public String getTenantId() {
	  return tenantId;
  }
}