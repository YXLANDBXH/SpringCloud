package com.xl.news.mapper;

import com.xl.news.pojo.News;
import com.xl.news.pojo.NewsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}