package com.wahaha.dao;

import com.wahaha.bean.SearchContent;
import com.wahaha.bean.SearchContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchContentMapper {
    long countByExample(SearchContentExample example);

    int deleteByExample(SearchContentExample example);

    int deleteByPrimaryKey(String userid);

    int insert(SearchContent record);

    int insertSelective(SearchContent record);

    List<SearchContent> selectByExample(SearchContentExample example);

    SearchContent selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") SearchContent record, @Param("example") SearchContentExample example);

    int updateByExample(@Param("record") SearchContent record, @Param("example") SearchContentExample example);

    int updateByPrimaryKeySelective(SearchContent record);

    int updateByPrimaryKey(SearchContent record);
}