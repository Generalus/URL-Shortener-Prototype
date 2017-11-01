package com.p44elood.gatewayapi.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@EnableHystrix
public class Controller {


    @GetMapping(value = "/gateway-api")
    public String gateWayGeneralInformation() {

        return "Сервис формирования сокращенных ссылок";
    }


    String erroreResponse() {
        return "сервис временно недоступен";
    }

    @HystrixCommand(fallbackMethod = "erroreResponse")
    @PostMapping(value = "/gateway-api")

    public @ResponseBody
    void addNewLink(@RequestParam String link, String key, Date expiration_date) {


        System.out.println("sfsgdgdfgdfg");


    }


}
