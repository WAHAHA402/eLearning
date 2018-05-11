package com.wahaha.dao;

import com.wahaha.bean.InterestDirection;
import com.wahaha.bean.InterestDirectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterestDirectionMapper {
    long countByExample(InterestDirectionExample example);

    int deleteByExample(InterestDirectionExample example);

    int insert(InterestDirection record);

    int insertSelective(InterestDirection record);

    List<InterestDirection> selectByExample(InterestDirectionExample example);

    int updateByExampleSelective(@Param("record") InterestDirection record, @Param("example") InterestDirectionExample example);

    int updateByExample(@Param("record") InterestDirection record, @Param("example") InterestDirectionExample example);
}