package com.hcq.hcqmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
/**
 * @author huchangqi
 */
@EnableRedisHttpSession
@EnableFeignClients(basePackages = "com.hcq.hcqmall.product.feign")
@EnableDiscoveryClient
@MapperScan("com.hcq.hcqmall.product.dao")
@SpringBootApplication
public class hcqmallProductApplication {

    /**
     * @Cacheable 触发将数据保存到缓存中的操作
     * @CacheEvict 触发将数据从缓存删除的操作
     * @CachePut
     * @Caching 组合以上多个操作
     * @CacheConfig
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(hcqmallProductApplication.class, args);
    }

}
