package com.generator.engineering.service;

import com.generator.engineering.dao.generator.entity.GenConfig;

/******************************************************************************************************
 *   createtime:  2020/12/11
 *   author:      wench
 ******************************************************************************************************/
public interface GeneratorService {
    byte[] generatorCode(GenConfig genConfig);
}
