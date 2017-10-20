package com.p44elood.GatewayApi;


import com.p44elood.GatewayApi.Configuration.GatawayConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@RibbonClient(name = "gateway-api", configuration = GatawayConfiguration.class)
public class GatewayApplication {




    public static void main(String[] args){
        SpringApplication.run(GatewayApplication.class, args);
    }
}
