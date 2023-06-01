package com.hcq.hcqmall.ware.service.impl;

import com.hcq.hcqmall.common.utils.Query;
import com.hcq.hcqmall.ware.entity.WareOrderTaskDetailEntity;
import com.hcq.hcqmall.ware.service.WareOrderTaskDetailService;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.ware.dao.WareOrderTaskDetailDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author huchangqi
 */
@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetailEntity> implements WareOrderTaskDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderTaskDetailEntity> page = this.page(
                new Query<WareOrderTaskDetailEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskDetailEntity>()
        );

        return new PageUtils(page);
    }

}