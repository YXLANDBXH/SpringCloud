package com.xl.news.feign;

import com.xl.news.pojo.Category;
import com.xl.news.pojo.News;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author XLong
 * @create 2021-07-03 19:22
 */
//@FeignClient("news-query-ms")
public interface FeignService {
    //@RequestMapping(value = "/getNewsList")
    public List<News> getNewsList();

    //@RequestMapping(value = "/getCategoryList")
    public List<Category> getCategoryList();
}
