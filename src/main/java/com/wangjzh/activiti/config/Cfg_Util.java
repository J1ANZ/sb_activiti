package com.wangjzh.activiti.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description 流程图的一些工具bean
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-7 00:43:13
 */
@Configuration
public class Cfg_Util {

    //jackson xml util
    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
