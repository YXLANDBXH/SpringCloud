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
@EnableEurekaClient
@MapperScan("com.xl.news.mapper")
public class NewsEditApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(NewsEditApp.class,args);
    }
}
