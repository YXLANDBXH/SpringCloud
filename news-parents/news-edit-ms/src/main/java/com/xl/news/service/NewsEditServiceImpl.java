package com.xl.news.service;

import com.xl.news.mapper.NewsMapper;
import com.xl.news.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XLong
 * @create 2021-07-04 11:38
 */
@Service
public class NewsEditServiceImpl implements NewsEditService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public void addNews(News news) {
        this.newsMapper.insert(news);
    }

    @Override
    public News findNewsById(int id) {
        return this.newsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateNews(News news) {
        this.newsMapper.updateByPrimaryKey(news);
    }

    @Override
    public void deleteNewsByIds(int[] ids) {
        for (int id : ids) {
            this.newsMapper.deleteByPrimaryKey(id);
        }
    }
}
