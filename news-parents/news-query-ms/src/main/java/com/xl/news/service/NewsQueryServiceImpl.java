package com.xl.news.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xl.news.mapper.CategoryMapper;
import com.xl.news.mapper.NewsMapper;
import com.xl.news.pojo.Category;
import com.xl.news.pojo.News;
import com.xl.news.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XLong
 * @create 2021-07-03 18:29
 */
@Service
public class NewsQueryServiceImpl implements NewsQueryService {

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<News> findNewsList() {
        List<News> newsList = this.newsMapper.selectByExample(null);
        return newsList;
    }

    @Override
    public List<Category> findCategory() {
        return this.categoryMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageResult pageResult = new PageResult();
        //开启分页查询
        PageHelper.startPage(pageNum,pageSize);
//        List<News> newsList = this.newsMapper.selectByExample(null);
        Page<News> page = (Page<News>) this.newsMapper.selectByExample(null);
        pageResult.setRows(page.getResult());
        pageResult.setTotal(page.getTotal());
        return pageResult;
    }
}
