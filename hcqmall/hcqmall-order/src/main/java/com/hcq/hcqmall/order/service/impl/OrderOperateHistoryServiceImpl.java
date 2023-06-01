package com.hcq.hcqmall.order.service.impl;

import com.hcq.hcqmall.common.utils.Query;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.order.dao.OrderOperateHistoryDao;
import com.hcq.hcqmall.order.entity.OrderOperateHistoryEntity;
import com.hcq.hcqmall.order.service.OrderOperateHistoryService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author yaoxinjia
 * @email 894548575@qq.com
 */
@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryDao, OrderOperateHistoryEntity> implements OrderOperateHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderOperateHistoryEntity> page = this.page(
                new Query<OrderOperateHistoryEntity>().getPage(params),
                new QueryWrapper<OrderOperateHistoryEntity>()
        );

        return new PageUtils(page);
    }

}