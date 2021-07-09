package com.xl.news.controller;

import com.xl.news.api.NewsQueryApi;
import com.xl.news.pojo.Category;
import com.xl.news.pojo.News;
import com.xl.news.pojo.PageResult;
import com.xl.news.service.NewsQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author XLong
 * @create 2021-07-03 18:31
 */
@RestController
public class NewsQueryController2 implements NewsQueryApi {

    @Autowired
    private NewsQueryService newsQueryService;

    @Override
    public List<News> getNewsList() {
        return this.newsQueryService.findNewsList();
    }

    @Override
    public List<Category> getCategoryList() {
        return this.newsQueryService.findCategory();
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        return this.newsQueryService.findPage(pageNum,pageSize);
    }

//    @RequestMapping(value = "/getNewsList")
//    public List<News> getNewsList(){
//        return this.newsQueryService.findNewsList();
//    }
//
//    @RequestMapping(value = "/getCategoryList")
//    public List<Category> getCategoryList(){
//        return this.newsQueryService.findCategory();
//    }
}
