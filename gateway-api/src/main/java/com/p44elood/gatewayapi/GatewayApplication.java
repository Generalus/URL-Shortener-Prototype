package com.p44elood.gatewayapi;


import com.p44elood.gatewayapi.Configuration.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@RibbonClient(name = "gateway-api", configuration = Configuration.class)
public class GatewayApplication {




    public static void main(String[] args){
        SpringApplication.run(GatewayApplication.class, args);
    }
}
