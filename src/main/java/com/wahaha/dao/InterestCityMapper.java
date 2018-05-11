package com.wahaha.dao;

import com.wahaha.bean.InterestCity;
import com.wahaha.bean.InterestCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterestCityMapper {
    long countByExample(InterestCityExample example);

    int deleteByExample(InterestCityExample example);

    int insert(InterestCity record);

    int insertSelective(InterestCity record);

    List<InterestCity> selectByExample(InterestCityExample example);

    int updateByExampleSelective(@Param("record") InterestCity record, @Param("example") InterestCityExample example);

    int updateByExample(@Param("record") InterestCity record, @Param("example") InterestCityExample example);
}