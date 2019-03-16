package com.cxw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
* 启动 EurekaServer7001_App
*   http://localhost:7001/   同Tomcat 界面 [还未注册服务]
* */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7003_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServer7003_App.class, args);
    }
}
