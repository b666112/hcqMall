package com.hcq.hcqmall.order.service.impl;

import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.common.utils.Query;
import com.hcq.hcqmall.order.dao.RefundInfoDao;
import com.hcq.hcqmall.order.entity.RefundInfoEntity;
import com.hcq.hcqmall.order.service.RefundInfoService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author yaoxinjia
 * @email 894548575@qq.com
 */
@Service("refundInfoService")
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoDao, RefundInfoEntity> implements RefundInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RefundInfoEntity> page = this.page(
                new Query<RefundInfoEntity>().getPage(params),
                new QueryWrapper<RefundInfoEntity>()
        );

        return new PageUtils(page);
    }

}