package com.hcq.hcqmall.order.service.impl;

import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.common.utils.Query;
import com.hcq.hcqmall.order.dao.OrderReturnReasonDao;
import com.hcq.hcqmall.order.entity.OrderReturnReasonEntity;
import com.hcq.hcqmall.order.service.OrderReturnReasonService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author yaoxinjia
 * @email 894548575@qq.com
 */
@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonDao, OrderReturnReasonEntity> implements OrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnReasonEntity> page = this.page(
                new Query<OrderReturnReasonEntity>().getPage(params),
                new QueryWrapper<OrderReturnReasonEntity>()
        );

        return new PageUtils(page);
    }

}