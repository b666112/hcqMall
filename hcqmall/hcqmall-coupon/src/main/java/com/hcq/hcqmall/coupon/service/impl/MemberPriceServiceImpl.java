package com.hcq.hcqmall.coupon.service.impl;

import com.hcq.hcqmall.common.utils.Query;
import com.hcq.hcqmall.coupon.entity.MemberPriceEntity;
import com.hcq.hcqmall.coupon.service.MemberPriceService;
import com.hcq.hcqmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.hcq.hcqmall.coupon.dao.MemberPriceDao;


@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceDao, MemberPriceEntity> implements MemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberPriceEntity> page = this.page(
                new Query<MemberPriceEntity>().getPage(params),
                new QueryWrapper<MemberPriceEntity>()
        );

        return new PageUtils(page);
    }

}