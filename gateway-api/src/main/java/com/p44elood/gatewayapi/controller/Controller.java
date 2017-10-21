package com.p44elood.gatewayapi.controller;


import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class Controller {



    @GetMapping(value = "gateway-api/")
    public String gateWayGeneralInformation() {
        return "Сервис формирования сокращенных ссылок";
    }

    @PostMapping(value = "gateway-api/")
    public @ResponseBody
    void addNewLink(@RequestParam String link, String key, Date expiration_date) {


       System.out.println("sfsgdgdfgdfg");


    }


}
