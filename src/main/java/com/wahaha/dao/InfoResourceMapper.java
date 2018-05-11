package com.wahaha.dao;

import com.wahaha.bean.InfoResource;
import com.wahaha.bean.InfoResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoResourceMapper {
    long countByExample(InfoResourceExample example);

    int deleteByExample(InfoResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InfoResource record);

    int insertSelective(InfoResource record);

    List<InfoResource> selectByExample(InfoResourceExample example);

    InfoResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InfoResource record, @Param("example") InfoResourceExample example);

    int updateByExample(@Param("record") InfoResource record, @Param("example") InfoResourceExample example);

    int updateByPrimaryKeySelective(InfoResource record);

    int updateByPrimaryKey(InfoResource record);
}