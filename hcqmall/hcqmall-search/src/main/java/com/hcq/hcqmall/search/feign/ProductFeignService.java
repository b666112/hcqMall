package com.hcq.hcqmall.search.feign;

import com.hcq.hcqmall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
/**
 * @author huchangqi
 */
@FeignClient("hcqmall-product")
public interface ProductFeignService {
    @GetMapping("/product/attr/info/{attrId}")
    public R attrInfo(@PathVariable("attrId")Long attrId);

    @GetMapping("/product/brand/infos")
    public R brandsInfo(@RequestParam("brandIds") List<Long> brandIds);
}
