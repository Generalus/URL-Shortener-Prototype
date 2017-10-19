package com.p44elovod.URLShortenerPrototype;


import com.p44elovod.URLShortenerPrototype.GatewayApi.Configuration.GatawayConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RibbonClient(name = "gateway-api", configuration = GatawayConfiguration.class)
public class GatewayApplication {




    public static void main(String[] args){
        SpringApplication.run(GatewayApplication.class, args);
    }
}
