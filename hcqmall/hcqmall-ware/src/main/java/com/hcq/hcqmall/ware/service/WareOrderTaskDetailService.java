package com.hcq.hcqmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;
/**
 * @author huchangqi
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

