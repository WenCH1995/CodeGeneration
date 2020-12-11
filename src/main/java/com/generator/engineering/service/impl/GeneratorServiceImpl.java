package com.generator.engineering.service.impl;


import cn.hutool.core.io.IoUtil;
import com.generator.engineering.dao.generator.entity.GenConfig;
import com.generator.engineering.dao.generator.mapper.GeneratorMapper;
import com.generator.engineering.generator.util.GenUtils;
import com.generator.engineering.service.GeneratorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

/******************************************************************************************************
 *   createtime:  2020/12/11
 *   author:      wench
 ******************************************************************************************************/
@Service
@Slf4j
public class GeneratorServiceImpl implements GeneratorService {

    @Autowired
    GeneratorMapper generatorMapper;

    @Override
    public byte[] generatorCode(GenConfig genConfig) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(outputStream);

        //查询表信息
        Map<String, String> table = queryTable(genConfig.getTableName());
        //查询列信息
        List<Map<String, String>> columns = queryColumns(genConfig.getTableName());
        //生成代码
        GenUtils.generatorCode(genConfig, table, columns, zip);
        IoUtil.close(zip);
        return outputStream.toByteArray();
    }
    private Map<String, String> queryTable(String tableName) {
        return generatorMapper.queryTable(tableName);
    }

    private List<Map<String, String>> queryColumns(String tableName) {
        return generatorMapper.queryColumns(tableName);
    }
}
