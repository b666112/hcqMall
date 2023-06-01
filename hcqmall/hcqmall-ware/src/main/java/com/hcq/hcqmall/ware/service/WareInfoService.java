package com.hcq.hcqmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.ware.entity.WareInfoEntity;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.ware.vo.FareVo;

import java.util.Map;

/**
 * @author huchangqi
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取运费和收货地址信息
     * @param addrId
     * @return
     */
    FareVo getFare(Long addrId);
}

