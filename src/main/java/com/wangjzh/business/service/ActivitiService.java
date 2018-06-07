package com.wangjzh.business.service;

import com.wangjzh.business.domain.ActivitiDeployment;

import java.util.List;

/**
 * @description 工作流逻辑接口
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-5 13:40:20
 */
public interface ActivitiService {

    public List<ActivitiDeployment> queryDeployment();

    public String deployActiviti();
}
