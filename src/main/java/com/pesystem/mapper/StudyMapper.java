package com.pesystem.mapper;

import com.pesystem.po.Study;
import com.pesystem.po.StudyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyMapper {
    int countByExample(StudyExample example);

    int deleteByExample(StudyExample example);

    int deleteByPrimaryKey(@Param("stdntId") String stdntId, @Param("peClassId") String peClassId);

    int insert(Study record);

    int insertSelective(Study record);

    List<Study> selectByExample(StudyExample example);

    int updateByExampleSelective(@Param("record") Study record, @Param("example") StudyExample example);

    int updateByExample(@Param("record") Study record, @Param("example") StudyExample example);
}