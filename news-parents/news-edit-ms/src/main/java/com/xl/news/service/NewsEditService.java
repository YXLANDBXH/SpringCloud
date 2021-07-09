package com.xl.news.service;

import com.xl.news.pojo.News;

/**
 * @author XLong
 * @create 2021-07-04 11:37
 */
public interface NewsEditService {
    //添加新闻功能
    public void addNews(News news);

    //根据id查询
    public News findNewsById(int id);

    //更新新闻
    public void updateNews(News news);

    //批量删除
    public void deleteNewsByIds(int[] ids);
}
