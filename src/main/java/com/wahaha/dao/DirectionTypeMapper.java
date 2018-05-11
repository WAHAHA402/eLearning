package com.wahaha.dao;

import com.wahaha.bean.DirectionType;
import com.wahaha.bean.DirectionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirectionTypeMapper {
    long countByExample(DirectionTypeExample example);

    int deleteByExample(DirectionTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DirectionType record);

    int insertSelective(DirectionType record);

    List<DirectionType> selectByExample(DirectionTypeExample example);

    DirectionType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DirectionType record, @Param("example") DirectionTypeExample example);

    int updateByExample(@Param("record") DirectionType record, @Param("example") DirectionTypeExample example);

    int updateByPrimaryKeySelective(DirectionType record);

    int updateByPrimaryKey(DirectionType record);
}