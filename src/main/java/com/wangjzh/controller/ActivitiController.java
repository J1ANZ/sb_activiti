package com.wangjzh.controller;

import com.wangjzh.business.domain.ActivitiDeployment;
import com.wangjzh.business.service.impl.ActivitiServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description 工作流controller
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-5 13:40:20
 */
@Api(value = "工作流Controller",tags = "")
@RestController
@RequestMapping(value = "/activiti")
public class ActivitiController {

    @Autowired
    private ActivitiServiceImpl activitiService;


    @ApiOperation(value = "获取流程图部署信息",notes = "")
    @RequestMapping(value = "/queryDeploy",method = RequestMethod.GET)
    public List<ActivitiDeployment> queryDeploy(){
        return activitiService.queryDeployment();
    }


}
