package com.p44elood.GatewayApi.GatewayApiRepository;

import com.p44elood.GatewayApi.GatewayApiModel.HashToURL;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface GatewayApiRepository extends CrudRepository<HashToURL, String> {

    List<HashToURL> findById(String hash);

}
