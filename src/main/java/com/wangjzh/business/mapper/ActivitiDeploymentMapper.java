package com.wangjzh.business.mapper;


import com.wangjzh.business.domain.ActivitiDeployment;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @description 流程图信息model接口
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-5 13:40:20
 */
public interface ActivitiDeploymentMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "resourceName", column = "resourceName"),
            @Result(property = "deployTime", column = "deployTime")
    })
    @Select("SELECT arp.id_ id," +
            "arp.name_ name," +
            "arp.resource_name_ resourceName," +
            "date_format(ard.deploy_time_,'%Y-%m-%d %H:%i:%s') deployTime " +
            "FROM ACT_RE_PROCDEF arp " +
            "left join ACT_RE_DEPLOYMENT ard " +
            "on arp.deployment_id_ = ard.id_ ORDER BY deployTime DESC")
    public List<ActivitiDeployment > queryDeploy();

}


