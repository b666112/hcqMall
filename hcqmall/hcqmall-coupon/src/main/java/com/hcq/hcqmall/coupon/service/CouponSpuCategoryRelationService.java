package com.hcq.hcqmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.hcq.hcqmall.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author yaoxinjia
 * @email 894548575@qq.com
 * @date 2021-02-09 20:18:04
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

