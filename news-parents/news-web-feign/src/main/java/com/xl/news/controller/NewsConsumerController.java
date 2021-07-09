package com.xl.news.controller;

import com.xl.news.feign.FeignService;
import com.xl.news.feign.FeignService2;
import com.xl.news.pojo.Category;
import com.xl.news.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author XLong
 * @create 2021-07-03 19:25
 */
//@RestController
@Controller
public class NewsConsumerController {

//    @Autowired
//    private FeignService feignService;

    @Autowired
    private FeignService2 feignService2;

    @RequestMapping(value = "/getNewsList")
    public ModelAndView getNewsList(){
        ModelAndView modelAndView = new ModelAndView();
        //查询新闻分类列表
        List<Category> categoryList = this.feignService2.getCategoryList();
        //查询新闻列表
        List<News> newsList = this.feignService2.getNewsList();

        //将数据存在域中
        modelAndView.addObject("newsList",newsList);
        modelAndView.addObject("categoryList",categoryList);
        //转发到页面
        modelAndView.setViewName("newslist");
        return modelAndView;
    }

//    @RequestMapping(value = "/getCategoryList")
//    public List<Category> getCategoryList(){
//        return this.feignService.getCategoryList();
//    }
}
