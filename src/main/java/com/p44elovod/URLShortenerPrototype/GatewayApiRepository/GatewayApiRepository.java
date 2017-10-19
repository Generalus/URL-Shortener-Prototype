package com.p44elovod.URLShortenerPrototype.GatewayApiRepository;

import com.p44elovod.URLShortenerPrototype.GatewayApiModel.HashToURL;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface GatewayApiRepository extends CrudRepository <HashToURL, String> {

    List<HashToURL> findById (String hash);

}
