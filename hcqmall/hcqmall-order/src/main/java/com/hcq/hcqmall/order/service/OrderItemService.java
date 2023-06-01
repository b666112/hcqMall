package com.hcq.hcqmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * @author yaoxinjia
 * @email 894548575@qq.com
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

