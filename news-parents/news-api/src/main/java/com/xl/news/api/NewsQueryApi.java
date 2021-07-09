package com.xl.news.api;

import com.xl.news.pojo.Category;
import com.xl.news.pojo.News;
import com.xl.news.pojo.PageResult;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author XLong
 * @create 2021-07-03 20:25
 */
public interface NewsQueryApi {
    @RequestMapping(value = "/getNewsList")
    public List<News> getNewsList();

    @RequestMapping(value = "/getCategoryList")
    public List<Category> getCategoryList();

    @RequestMapping(value = "/findPage")
    public PageResult findPage(int pageNum,int pageSize);
}
