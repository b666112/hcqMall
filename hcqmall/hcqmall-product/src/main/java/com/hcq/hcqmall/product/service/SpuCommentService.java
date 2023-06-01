package com.hcq.hcqmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.product.entity.SpuCommentEntity;
import com.hcq.hcqmall.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价
 *
 * @author yaoxinjia
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

