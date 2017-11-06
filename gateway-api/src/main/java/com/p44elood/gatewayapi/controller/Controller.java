package com.p44elood.gatewayapi.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController

public class Controller {


    @PostMapping(value = "/gateway-api")
    public @ResponseBody
    void addNewLink(@RequestParam String link, String key, Date expiration_date) {


        System.out.println("sfsgdgdfgdfg");


    }

    @GetMapping(value = "/gateway-api")
    public String gateWayGeneralInformation() {

        return "Сервис формирования сокращенных ссылок";
    }

    @HystrixCommand(fallbackMethod = "error")
    @GetMapping(value = "/gateway-api/{link}")
    public String getQuery(@PathVariable("link") String link) {
        throw new RuntimeException();
    }


    String error(String string) {
        return "Service is unavailable now!";
    }
}
