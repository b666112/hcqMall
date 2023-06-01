package com.hcq.hcqmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author yaoxinjia
 * @email 894548575@qq.com
 * @date 2021-02-09 20:58:11
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

