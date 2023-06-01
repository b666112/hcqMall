package com.hcq.hcqmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.ware.entity.WareOrderTaskEntity;
import com.hcq.hcqmall.common.utils.PageUtils;

import java.util.Map;

/**
 * @author huchangqi
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);

    WareOrderTaskEntity getOrderTaskByOrderSn(String orderSn);
}

