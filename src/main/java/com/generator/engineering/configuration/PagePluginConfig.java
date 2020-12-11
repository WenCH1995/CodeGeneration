package com.generator.engineering.configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/******************************************************************************************************
 *  introduction:
 *
 *      mybatis-plus 分页插件配置
 *
 *
 *
 *   createtime:  2020/12/11
 *   author:      wench
 ******************************************************************************************************/
@Configuration
public class PagePluginConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType("mysql");
        return paginationInterceptor;
    }

}
