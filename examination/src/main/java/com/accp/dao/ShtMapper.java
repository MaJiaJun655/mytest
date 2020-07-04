package com.accp.dao;

import com.accp.model.Sht;
import com.accp.model.ShtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShtMapper {
    int countByExample(ShtExample example);

    int deleteByExample(ShtExample example);

    int deleteByPrimaryKey(Integer shid);

    int insert(Sht record);

    int insertSelective(Sht record);

    List<Sht> selectByExample(ShtExample example);
    
    List<Sht> selectbykhid(Integer khid);

    Sht selectByPrimaryKey(Integer shid);

    int updateByExampleSelective(@Param("record") Sht record, @Param("example") ShtExample example);

    int updateByExample(@Param("record") Sht record, @Param("example") ShtExample example);

    int updateByPrimaryKeySelective(Sht record);

    int updateByPrimaryKey(Sht record);
}