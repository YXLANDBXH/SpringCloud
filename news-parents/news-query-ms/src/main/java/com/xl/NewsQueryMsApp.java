package com.xl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient //开启eureka客户端支持
@MapperScan("com.xl.news.mapper")
public class NewsQueryMsApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(NewsQueryMsApp.class,args);
    }
}
