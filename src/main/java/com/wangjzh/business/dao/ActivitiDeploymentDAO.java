package com.wangjzh.business.dao;


import com.wangjzh.business.domain.ActivitiDeployment;
import com.wangjzh.business.mapper.ActivitiDeploymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description 流程图信息实体映射接口
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-5 13:40:20
 */
@Repository
public class ActivitiDeploymentDAO {

    @Autowired
    private ActivitiDeploymentMapper activitiDeploymentMapper;

    public List<ActivitiDeployment> queryDeploy(){
        return activitiDeploymentMapper.queryDeploy();
    }

}
