package com.hcq.hcqmall.product.feign;

import com.hcq.hcqmall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author huchangqi
 */
@FeignClient("hcqmall-ware")
public interface WareFeignService {


    @PostMapping("/ware/waresku/hasStock")
    R getSkuHasStock(@RequestBody List<Long> SkuIds);
}
