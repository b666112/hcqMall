package com.hcq.hcqmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.product.entity.SkuInfoEntity;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.product.vo.SkuItemVo;

import java.util.List;
import java.util.Map;

/**
 * sku信息
 *
 * @author yaoxinjia
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuInfo(SkuInfoEntity skuInfoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);

    List<SkuInfoEntity> getSkusBySpuId(Long spuId);

    SkuItemVo item(Long skuId);
}

