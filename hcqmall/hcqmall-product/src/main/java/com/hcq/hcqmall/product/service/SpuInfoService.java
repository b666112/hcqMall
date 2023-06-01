package com.hcq.hcqmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.product.entity.SpuInfoEntity;
import com.hcq.hcqmall.product.vo.SpuSaveVo;
import com.hcq.hcqmall.common.utils.PageUtils;

import java.util.Map;

/**
 * spu信息
 *
 * @author yaoxinjia
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);

    /**
     * 商品上架
     * @param spuId
     */
    void up(Long spuId);

    SpuInfoEntity getSpuInfoBySkuId(Long skuId);
}

