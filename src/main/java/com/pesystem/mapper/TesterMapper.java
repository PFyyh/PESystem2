package com.pesystem.mapper;

import com.pesystem.po.Tester;
import com.pesystem.po.TesterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TesterMapper {
    int countByExample(TesterExample example);

    int deleteByExample(TesterExample example);

    int deleteByPrimaryKey(String testerId);

    int insert(Tester record);

    int insertSelective(Tester record);

    List<Tester> selectByExample(TesterExample example);

    int updateByExampleSelective(@Param("record") Tester record, @Param("example") TesterExample example);

    int updateByExample(@Param("record") Tester record, @Param("example") TesterExample example);
}