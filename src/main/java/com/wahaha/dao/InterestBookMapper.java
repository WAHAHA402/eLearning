package com.wahaha.dao;

import com.wahaha.bean.InterestBook;
import com.wahaha.bean.InterestBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterestBookMapper {
    long countByExample(InterestBookExample example);

    int deleteByExample(InterestBookExample example);

    int insert(InterestBook record);

    int insertSelective(InterestBook record);

    List<InterestBook> selectByExample(InterestBookExample example);

    int updateByExampleSelective(@Param("record") InterestBook record, @Param("example") InterestBookExample example);

    int updateByExample(@Param("record") InterestBook record, @Param("example") InterestBookExample example);
}