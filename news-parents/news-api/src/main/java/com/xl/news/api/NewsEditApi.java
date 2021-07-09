package com.xl.news.api;

import com.xl.news.pojo.News;
import com.xl.news.pojo.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author XLong
 * @create 2021-07-04 11:32
 */
public interface NewsEditApi {

    /**
     * 添加新闻信息
     * @param news
     * @return
     */
    @RequestMapping(value = "/addNews",method = RequestMethod.POST)
//    @PostMapping(value = "/addNews")
    public Result addNews(@RequestBody News news);

    /**
     * 根据id查询新闻信息
     * restful 风格   /findNewsById/1
     *   get  请求  /findNewsById?id = 1
     * @param id
     * @return
     */
    @RequestMapping(value = "/findNewsById/{id}")
    public News findNewsById(@PathVariable int id);

    /**
     * 更新新闻
     * @param news
     */
    @RequestMapping(value = "/updateNews",method = RequestMethod.POST)
    public Result updateNews(@RequestBody News news);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping(value = "/deleteNewsByIds")
    public Result deleteNewsByIds(int[] ids);
}
