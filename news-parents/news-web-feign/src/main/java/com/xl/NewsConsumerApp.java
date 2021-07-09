package com.xl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients//开启feign客户端扫描
public class NewsConsumerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(NewsConsumerApp.class,args);
    }
}
