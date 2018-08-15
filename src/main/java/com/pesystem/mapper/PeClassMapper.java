package com.pesystem.mapper;

import com.pesystem.po.PeClass;
import com.pesystem.po.PeClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeClassMapper {
    int countByExample(PeClassExample example);

    int deleteByExample(PeClassExample example);

    int deleteByPrimaryKey(String peClassId);

    int insert(PeClass record);

    int insertSelective(PeClass record);

    List<PeClass> selectByExample(PeClassExample example);

    PeClass selectByPrimaryKey(String peClassId);

    int updateByExampleSelective(@Param("record") PeClass record, @Param("example") PeClassExample example);

    int updateByExample(@Param("record") PeClass record, @Param("example") PeClassExample example);

    int updateByPrimaryKeySelective(PeClass record);

    int updateByPrimaryKey(PeClass record);
}