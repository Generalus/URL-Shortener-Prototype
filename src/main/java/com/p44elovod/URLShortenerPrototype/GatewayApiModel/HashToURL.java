package com.p44elovod.URLShortenerPrototype.GatewayApiModel;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@DynamoDBTable(tableName = "HASH_TO_URL")
@Data
public class HashToURL {

    @DynamoDBHashKey
    private String hash;

    private String originalUrl;


    private Date expirationDate;

    private BigInteger counter;

    String key;


    @DynamoDBAttribute
    public String getOriginalUrl(){
        return originalUrl;
    }





}
