package com.generator.engineering.dao.generator.mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 代码生成- Mapper 接口
 * </p>
 *
 * @author wench
 * @since 2020-12-11
 */
public interface GeneratorMapper {

    /**
     * 分页查询表格
     *
     * @param
     * @return
     */
//	List<Map<String, Object>> queryList(Query params,@Param("tableName") String tableName);
    List<Map<String, Object>> queryList();


    /**
     * 查询表信息
     * @param tableName 表名称
     * @return
     */
    Map<String, String> queryTable(String tableName);

    /**
     * 查询表列信息
     * @param tableName 表名称
     * @return
     */
    List<Map<String, String>> queryColumns(String tableName);
}
