package com.wangjzh.business.service.impl;


import com.wangjzh.business.dao.ActivitiDeploymentDAO;
import com.wangjzh.business.domain.ActivitiDeployment;
import com.wangjzh.business.service.ActivitiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description 工作流逻辑实现
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-5 13:40:20
 */
@Service
public class ActivitiServiceImpl implements ActivitiService{

    @Autowired
    private ActivitiDeploymentDAO activitiDeploymentDAO;

    private Logger LOG = LoggerFactory.getLogger(ActivitiServiceImpl.class);


    @Override
    public List<ActivitiDeployment> queryDeployment() {

        List<ActivitiDeployment> list = activitiDeploymentDAO.queryDeploy();
        return list;
    }

    @Override
    public String deployActiviti() {
        return null;
    }
}
