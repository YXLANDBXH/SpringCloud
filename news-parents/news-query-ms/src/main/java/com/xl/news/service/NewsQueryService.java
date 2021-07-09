package com.xl.news.service;

import com.xl.news.pojo.Category;
import com.xl.news.pojo.News;
import com.xl.news.pojo.PageResult;

import java.util.List;

/**
 * @author XLong
 * @create 2021-07-03 18:24
 */
public interface NewsQueryService {
    //查询新闻列表
    public List<News> findNewsList();

    //查询新闻分类列表
    public List<Category> findCategory();

    //查询分页数据
    public PageResult findPage(int pageNum, int pageSize);

}
