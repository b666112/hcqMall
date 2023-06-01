package com.hcq.hcqmall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @author huchangqi
 */
@EnableDiscoveryClient
@SpringBootApplication
public class hcqmallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(hcqmallThirdPartyApplication.class, args);
    }

}
