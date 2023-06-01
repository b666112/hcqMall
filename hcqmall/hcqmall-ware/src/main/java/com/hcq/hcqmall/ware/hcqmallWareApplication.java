package com.hcq.hcqmall.ware;

import com.alibaba.cloud.seata.GlobalTransactionAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * @author huchangqi
 */
@EnableRabbit
@SpringBootApplication(exclude = GlobalTransactionAutoConfiguration.class)
@EnableTransactionManagement
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.hcq.hcqmall.ware.dao")

public class hcqmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(hcqmallWareApplication.class, args);
    }

}
