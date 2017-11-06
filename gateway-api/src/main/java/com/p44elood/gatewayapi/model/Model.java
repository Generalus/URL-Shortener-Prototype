package com.p44elood.gatewayapi.model;


import lombok.Data;

import java.util.Date;


@Data
public class Model {

    String key;
    private String link;
    private Date expirationDate;


}
