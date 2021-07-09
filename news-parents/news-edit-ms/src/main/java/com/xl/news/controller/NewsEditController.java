package com.xl.news.controller;

import com.xl.news.api.NewsEditApi;
import com.xl.news.pojo.News;
import com.xl.news.pojo.Result;
import com.xl.news.service.NewsEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author XLong
 * @create 2021-07-04 11:40
 */
@RestController
public class NewsEditController implements NewsEditApi {

    @Autowired
    private NewsEditService newsEditService;

    @Override
    public Result addNews(News news) {
        Result  result = new Result();
        try {
            // 封装创建时间
            news.setCreatedate(new Date());
            this.newsEditService.addNews(news);

            result.setMessage("添加新闻数据成功");
            result.setSuccess(true);
        }
        catch (Exception e) {
            System.out.println(e);
            result.setMessage("添加新闻数据失败");
            result.setSuccess(false);
        }
        return result;
    }

    @Override
    public News findNewsById(int id) {
        return this.newsEditService.findNewsById(id);
    }

    @Override
    public Result updateNews(News news) {
        Result result = new Result();
        try {
            // 封装创建时间
            news.setCreatedate(new Date());
            this.newsEditService.updateNews(news);

            result.setMessage("更新新闻数据成功");
            result.setSuccess(true);
        }
        catch (Exception e) {
            System.out.println(e);
            result.setMessage("更新新闻数据失败");
            result.setSuccess(false);
        }
        return result;
    }

    @Override
    public Result deleteNewsByIds(int[] ids) {
        Result result = new Result();
        try {
            this.newsEditService.deleteNewsByIds(ids);
            result.setMessage("批量删除新闻数据成功");
            result.setSuccess(true);
        }
        catch (Exception e) {
            System.out.println(e);
            result.setMessage("批量删除新闻数据失败");
            result.setSuccess(false);
        }
        return result;
    }
}
