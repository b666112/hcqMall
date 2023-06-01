package com.hcq.hcqmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.common.to.OrderTo;
import com.hcq.hcqmall.common.to.mq.StockLockedTo;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.ware.entity.WareSkuEntity;
import com.hcq.hcqmall.ware.vo.SkuHasStockVo;
import com.hcq.hcqmall.ware.vo.WareSkuLockVo;

import java.util.List;
import java.util.Map;
/**
 * @author huchangqi
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 添加库存
     * @param skuId
     * @param wareId
     * @param skuNum
     */
    void addStock(Long skuId, Long wareId, Integer skuNum);

    /**
     * 判断是否有库存
     * @param skuIds
     * @return
     */
    List<SkuHasStockVo> getSkuHasStock(List<Long> skuIds);

    /**
     * 锁定库存
     * @param vo
     * @return
     */
    boolean orderLockStock(WareSkuLockVo vo);


    /**
     * 解锁库存
     * @param to
     */
    void unlockStock(StockLockedTo to);

    /**
     * 解锁订单
     * @param orderTo
     */
    void unlockStock(OrderTo orderTo);
}

