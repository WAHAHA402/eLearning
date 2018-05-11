package com.wahaha.dao;

import com.wahaha.bean.SearchResource;
import com.wahaha.bean.SearchResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchResourceMapper {
    long countByExample(SearchResourceExample example);

    int deleteByExample(SearchResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SearchResource record);

    int insertSelective(SearchResource record);

    List<SearchResource> selectByExample(SearchResourceExample example);

    SearchResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SearchResource record, @Param("example") SearchResourceExample example);

    int updateByExample(@Param("record") SearchResource record, @Param("example") SearchResourceExample example);

    int updateByPrimaryKeySelective(SearchResource record);

    int updateByPrimaryKey(SearchResource record);
}