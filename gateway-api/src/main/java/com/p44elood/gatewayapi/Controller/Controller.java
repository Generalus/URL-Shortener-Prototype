package com.p44elood.gatewayapi.Controller;


import com.p44elood.gatewayapi.Model.HashToURL;
import com.p44elood.gatewayapi.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class Controller {

    @Autowired
    Repository repository;

    @GetMapping(value = "gateway-api")
    public String gateWayGeneralInformation() {
        return "Сервис формирования сокращенных ссылок";
    }

    @PostMapping(value = "gateway-api")
    public @ResponseBody
    void addNewLink(@RequestParam String link, String key, Date expiration_date) {

        HashToURL hashToURL = new HashToURL();
        hashToURL.setOriginalUrl(link);
        hashToURL.setKey(key);
        hashToURL.setExpirationDate(expiration_date);
        repository.save(hashToURL);


    }


}
