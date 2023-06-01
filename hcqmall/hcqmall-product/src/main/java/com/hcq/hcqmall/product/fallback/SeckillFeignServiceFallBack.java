package com.hcq.hcqmall.product.fallback;

import com.hcq.hcqmall.common.exception.BizCodeEnum;
import com.hcq.hcqmall.common.utils.R;
import com.hcq.hcqmall.product.feign.SeckillFeignService;
import org.springframework.stereotype.Component;

/**
 * @author huchangqi
 */
@Component
public class SeckillFeignServiceFallBack implements SeckillFeignService {
    @Override
    public R getSkuSeckilInfo(Long skuId) {
        return R.error(BizCodeEnum.TO_MANY_REQUEST.getCode(),BizCodeEnum.TO_MANY_REQUEST.getMsg());
    }
}
