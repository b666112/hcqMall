package com.hcq.hcqmall.order.service.impl;

import com.hcq.hcqmall.common.utils.Query;
import com.hcq.hcqmall.order.entity.OrderReturnApplyEntity;
import com.hcq.hcqmall.order.service.OrderReturnApplyService;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.order.dao.OrderReturnApplyDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author yaoxinjia
 * @email 894548575@qq.com
 */
@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyDao, OrderReturnApplyEntity> implements OrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnApplyEntity> page = this.page(
                new Query<OrderReturnApplyEntity>().getPage(params),
                new QueryWrapper<OrderReturnApplyEntity>()
        );

        return new PageUtils(page);
    }

}