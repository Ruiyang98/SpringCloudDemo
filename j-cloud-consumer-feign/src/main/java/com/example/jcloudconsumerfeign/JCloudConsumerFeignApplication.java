package com.example.jcloudconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


//@SpringBootApplication(exclude={
//        com.example.jcloudconsumerfeign.JCloudConsumerFeignApplication.class,
//       org.springframework.boot.autoconfigure.web.ServerProperties.class
//})
@SpringBootApplication
@EnableEurekaClient //表明这是一个eureka客户端
@EnableFeignClients(basePackages = "com.example.*") //开启feign
public class JCloudConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(JCloudConsumerFeignApplication.class, args);
    }

}
