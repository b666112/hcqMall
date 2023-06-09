package com.hcq.hcqmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.common.to.SkuReductionTo;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author yaoxinjia
 * @email 894548575@qq.com
 * @date 2021-02-09 20:18:04
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);
}

