package com.wangjzh.common.datasource;


import com.wangjzh.business.dao.ActivitiDeploymentDAO;
import com.wangjzh.business.service.impl.ActivitiServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 数据源AOP配置
 */
@Aspect
@Component
public class DataSourceAspect {

    /**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(* com.wangjzh.business.service.impl.*.*(..))")
    public void declareJointPoint(){}

    @Before("declareJointPoint()")
    public void setDataSourceKey(JoinPoint joinpoint) {
        if(joinpoint.getTarget() instanceof ActivitiServiceImpl){
            DatabaseContextHolder.setDatabaseType(DatabaseType.activiti);
        }
    }
}
