package com.pesystem.mapper;

import com.pesystem.po.AdministrativeClass;
import com.pesystem.po.AdministrativeClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministrativeClassMapper {
    int countByExample(AdministrativeClassExample example);

    int deleteByExample(AdministrativeClassExample example);

    int deleteByPrimaryKey(String acId);

    int insert(AdministrativeClass record);

    int insertSelective(AdministrativeClass record);

    List<AdministrativeClass> selectByExample(AdministrativeClassExample example);

    AdministrativeClass selectByPrimaryKey(String acId);

    int updateByExampleSelective(@Param("record") AdministrativeClass record, @Param("example") AdministrativeClassExample example);

    int updateByExample(@Param("record") AdministrativeClass record, @Param("example") AdministrativeClassExample example);

    int updateByPrimaryKeySelective(AdministrativeClass record);

    int updateByPrimaryKey(AdministrativeClass record);
}