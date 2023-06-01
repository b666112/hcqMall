package com.hcq.hcqmall.product.feign;


import com.hcq.hcqmall.common.to.es.SkuEsModel;
import com.hcq.hcqmall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author huchangqi
 */
@FeignClient("hcqmall-search")
public interface SearchFeignService {
    @PostMapping("/search/save/product")
    R productStatusUp(@RequestBody List<SkuEsModel> skuEsModels);
}
