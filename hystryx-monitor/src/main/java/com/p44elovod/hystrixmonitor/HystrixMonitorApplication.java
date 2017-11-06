package com.p44elovod.hystrixmonitor;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard


public class HystrixMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixMonitorApplication.class, args);
    }


}
