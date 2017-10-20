package com.p44elood.gatewayapi.Repository;

import com.p44elood.gatewayapi.Model.HashToURL;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface Repository extends CrudRepository<HashToURL, String> {

    List<HashToURL> findById(String hash);

}
