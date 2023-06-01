package com.hcq.hcqmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.member.entity.MemberLevelEntity;
import com.hcq.hcqmall.common.utils.PageUtils;

import java.util.Map;

/**
 * 会员等级
 *
 * @author yaoxinjia
 * @email 894548575@qq.com
 * @date 2021-02-09 20:58:11
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

