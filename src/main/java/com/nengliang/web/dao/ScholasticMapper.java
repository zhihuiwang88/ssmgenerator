package com.nengliang.web.dao;

import com.nengliang.web.entity.Scholastic;
import com.nengliang.web.entity.ScholasticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScholasticMapper {
    int countByExample(ScholasticExample example);

    int deleteByExample(ScholasticExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Scholastic record);

    int insertSelective(Scholastic record);

    List<Scholastic> selectByExample(ScholasticExample example);

    Scholastic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Scholastic record, @Param("example") ScholasticExample example);

    int updateByExample(@Param("record") Scholastic record, @Param("example") ScholasticExample example);

    int updateByPrimaryKeySelective(Scholastic record);

    int updateByPrimaryKey(Scholastic record);
}