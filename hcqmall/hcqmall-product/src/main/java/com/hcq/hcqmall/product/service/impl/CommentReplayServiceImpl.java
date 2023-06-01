package com.hcq.hcqmall.product.service.impl;

import com.hcq.hcqmall.common.utils.Query;
import com.hcq.hcqmall.product.entity.CommentReplayEntity;
import com.hcq.hcqmall.product.service.CommentReplayService;
import com.hcq.hcqmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.hcq.hcqmall.product.dao.CommentReplayDao;

/**
 * @author huchangqi
 */
@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}