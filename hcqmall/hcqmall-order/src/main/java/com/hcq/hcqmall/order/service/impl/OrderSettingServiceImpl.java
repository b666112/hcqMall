package com.hcq.hcqmall.order.service.impl;

import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.common.utils.Query;
import com.hcq.hcqmall.order.dao.OrderSettingDao;
import com.hcq.hcqmall.order.entity.OrderSettingEntity;
import com.hcq.hcqmall.order.service.OrderSettingService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author yaoxinjia
 * @email 894548575@qq.com
 */
@Service("orderSettingService")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingDao, OrderSettingEntity> implements OrderSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderSettingEntity> page = this.page(
                new Query<OrderSettingEntity>().getPage(params),
                new QueryWrapper<OrderSettingEntity>()
        );

        return new PageUtils(page);
    }

}