package com.hcq.hcqmall.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @author yaoxinjia
 * @email 894548575@qq.com
 */
@ConfigurationProperties(prefix = "hcqmall.thread")
@Data
public class ThreadPoolConfigProperties {

    private Integer coreSize;

    private Integer maxSize;

    private Integer keepAliveTime;


}
