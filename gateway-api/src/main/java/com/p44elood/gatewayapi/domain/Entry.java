package com.p44elood.gatewayapi.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Entry {
    String key;
    private String link;
    private Date expirationDate;
}
