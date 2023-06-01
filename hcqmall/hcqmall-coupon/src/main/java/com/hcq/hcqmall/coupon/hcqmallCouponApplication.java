package com.hcq.hcqmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.hcq.hcqmall.coupon.dao")
@EnableDiscoveryClient
public class hcqmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(hcqmallCouponApplication.class, args);
    }

}
