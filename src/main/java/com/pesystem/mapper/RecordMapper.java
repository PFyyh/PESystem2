package com.pesystem.mapper;

import com.pesystem.po.Record;
import com.pesystem.po.RecordExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordMapper {
    int countByExample(RecordExample example);

    int deleteByExample(RecordExample example);

    int deleteByPrimaryKey(@Param("recYear") Date recYear, @Param("stdntId") String stdntId);

    int insert(Record record);

    int insertSelective(Record record);

    List<Record> selectByExample(RecordExample example);

    Record selectByPrimaryKey(@Param("recYear") Date recYear, @Param("stdntId") String stdntId);

    int updateByExampleSelective(@Param("record") Record record, @Param("example") RecordExample example);

    int updateByExample(@Param("record") Record record, @Param("example") RecordExample example);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}