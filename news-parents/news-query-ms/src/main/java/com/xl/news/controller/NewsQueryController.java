package com.xl.news.controller;

import com.xl.news.pojo.Category;
import com.xl.news.pojo.News;
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
public class NewsQueryController {

    @Autowired
    private NewsQueryService newsQueryService;

    //@RequestMapping(value = "/getNewsList")
    public List<News> getNewsList(){
        return this.newsQueryService.findNewsList();
    }

   // @RequestMapping(value = "/getCategoryList")
    public List<Category> getCategoryList(){
        return this.newsQueryService.findCategory();
    }
}
