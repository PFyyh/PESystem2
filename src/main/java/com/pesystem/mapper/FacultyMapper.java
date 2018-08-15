package com.pesystem.mapper;

import com.pesystem.po.Faculty;
import com.pesystem.po.FacultyExample;
import java.util.List;

import com.pesystem.vo.FacultyCustom;
import org.apache.ibatis.annotations.Param;

public interface FacultyMapper {
    int countByExample(FacultyExample example);

    int deleteByExample(FacultyExample example);

    int deleteByPrimaryKey(Integer facultyId);

    int insert(Faculty record);

    int insertSelective(Faculty record);

    List<FacultyCustom> selectByExample(FacultyExample example);

    Faculty selectByPrimaryKey(Integer facultyId);

    int updateByExampleSelective(@Param("record") Faculty record, @Param("example") FacultyExample example);

    int updateByExample(@Param("record") Faculty record, @Param("example") FacultyExample example);

    int updateByPrimaryKeySelective(Faculty record);

    int updateByPrimaryKey(Faculty record);
}