package com.hcq.hcqmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.ware.entity.PurchaseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * @author huchangqi
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<PurchaseDetailEntity> listDetailByPurchaseId(Long id);
}

