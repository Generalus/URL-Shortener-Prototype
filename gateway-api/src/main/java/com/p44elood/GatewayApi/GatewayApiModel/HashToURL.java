package com.p44elood.GatewayApi.GatewayApiModel;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@DynamoDBTable(tableName = "HASH_TO_URL")
@Data
public class HashToURL {

    String key;
    @DynamoDBHashKey
    private String hash;
    private String originalUrl;
    private Date expirationDate;
    private BigInteger counter;

    @DynamoDBAttribute
    public String getOriginalUrl() {
        return originalUrl;
    }


}
