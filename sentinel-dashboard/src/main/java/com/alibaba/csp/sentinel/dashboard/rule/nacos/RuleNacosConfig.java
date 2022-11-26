package com.alibaba.csp.sentinel.dashboard.rule.nacos;


import com.alibaba.csp.sentinel.dashboard.datasource.entity.gateway.ApiDefinitionEntity;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.gateway.GatewayFlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.*;
import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.fastjson.JSON;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.config.ConfigFactory;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Properties;

/**
 * @Author: LiHuaZhi
 * @Date: 2022/3/3 16:10
 * @Description:
 **/
@Configuration
public class RuleNacosConfig {
    @Bean
    public ConfigService nacosConfigService() throws Exception {
        Properties properties = new Properties();
        properties.put(PropertyKeyConst.SERVER_ADDR, "162.14.115.18:8848");
        // properties.put(PropertyKeyConst.NAMESPACE, "xxx"); 命名科技
        // properties.put(PropertyKeyConst.USERNAME, "xxx"); 用户名
        // properties.put(PropertyKeyConst.PASSWORD, "xxx"); 密码
        return ConfigFactory.createConfigService(properties);
    }
}
