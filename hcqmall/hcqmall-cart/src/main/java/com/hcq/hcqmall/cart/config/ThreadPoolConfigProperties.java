package com.hcq.hcqmall.cart.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author yaoxinjia
 */
@ConfigurationProperties(prefix = "hcqmall.thread")
@Data
public class ThreadPoolConfigProperties {

    private Integer coreSize;

    private Integer maxSize;

    private Integer keepAliveTime;


}
