package com.hcq.hcqmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author yaoxinjia
 * @email 894548575@qq.com
 * @date 2021-02-09 20:18:04
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

