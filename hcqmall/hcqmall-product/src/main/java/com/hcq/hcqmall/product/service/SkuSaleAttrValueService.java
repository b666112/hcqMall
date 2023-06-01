package com.hcq.hcqmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.hcq.hcqmall.product.entity.SkuSaleAttrValueEntity;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.product.vo.SkuItemSaleAttrVo;

import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author yaoxinjia
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SkuItemSaleAttrVo> getSaleAttrsBySpuId(Long spuId);

    List<String> getSkuSaleAttrValuesAsStringList(Long skuId);
}

