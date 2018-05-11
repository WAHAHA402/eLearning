package com.wahaha.dao;

import com.wahaha.bean.JobType;
import com.wahaha.bean.JobTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobTypeMapper {
    long countByExample(JobTypeExample example);

    int deleteByExample(JobTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobType record);

    int insertSelective(JobType record);

    List<JobType> selectByExample(JobTypeExample example);

    JobType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobType record, @Param("example") JobTypeExample example);

    int updateByExample(@Param("record") JobType record, @Param("example") JobTypeExample example);

    int updateByPrimaryKeySelective(JobType record);

    int updateByPrimaryKey(JobType record);
}