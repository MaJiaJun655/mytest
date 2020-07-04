package com.accp.dao;

import com.accp.model.Kht;
import com.accp.model.KhtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KhtMapper {
    int countByExample(KhtExample example);

    int deleteByExample(KhtExample example);

    int deleteByPrimaryKey(Integer khid);

    int insert(Kht record);

    int insertSelective(Kht record);

    List<Kht> selectByExample(KhtExample example);
    
    Kht selectkybykhid(Integer khid);

    Kht selectByPrimaryKey(Integer khid);

    int updateByExampleSelective(@Param("record") Kht record, @Param("example") KhtExample example);

    int updateByExample(@Param("record") Kht record, @Param("example") KhtExample example);

    int updateByPrimaryKeySelective(Kht record);

    int updateByPrimaryKey(Kht record);
}