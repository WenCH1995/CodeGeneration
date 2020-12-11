package com.generator.engineering.controller;


import cn.hutool.core.io.IoUtil;
import com.generator.engineering.dao.generator.entity.GenConfig;
import com.generator.engineering.service.GeneratorService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/******************************************************************************************************
 *  introduction:
 *
 *      controller层模板
 *
 *
 *
 *
 *
 *   createtime:  2020/12/11
 *   author:      wench
 ******************************************************************************************************/
@RestController
@RequestMapping("/generator")
@Api(value = "代码生成模块",tags = "代码生成模块")
@Slf4j
public class GeneratorController {

    @Autowired
    GeneratorService generatorService;

    /**
     * 生成代码
     */
    @PostMapping("/code")
    public void code(@RequestBody GenConfig genConfig, HttpServletResponse response) throws IOException {
        byte[] data = generatorService.generatorCode(genConfig);

        response.reset();
        response.setHeader("Content-Disposition", String.format("attachment; filename=%s.zip", genConfig.getTableName()));
        response.addHeader("Content-Length", "" + data.length);
        response.setContentType("application/octet-stream; charset=UTF-8");

        IoUtil.write(response.getOutputStream(), Boolean.TRUE, data);
    }

}
