package com.hcq.hcqmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.member.entity.MemberEntity;
import com.hcq.hcqmall.member.exception.PhoneException;
import com.hcq.hcqmall.member.exception.UsernameException;
import com.hcq.hcqmall.member.vo.MemberUserLoginVo;
import com.hcq.hcqmall.member.vo.MemberUserRegisterVo;
import com.hcq.hcqmall.member.vo.SocialUser;

import java.util.Map;

/**
 * @author yaoxinjia
 * @email 894548575@qq.com
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 用户注册
     * @param vo
     */
    void register(MemberUserRegisterVo vo);

    /**
     * 判断邮箱是否重复
     * @param phone
     * @return
     */
    void checkPhoneUnique(String phone) throws PhoneException;

    /**
     * 判断用户名是否重复
     * @param userName
     * @return
     */
    void checkUserNameUnique(String userName) throws UsernameException;

    /**
     * 用户登录
     * @param vo
     * @return
     */
    MemberEntity login(MemberUserLoginVo vo);

    /**
     * 社交用户的登录
     * @param socialUser
     * @return
     */
    MemberEntity login(SocialUser socialUser) throws Exception;

    /**
     * 微信登录
     * @param accessTokenInfo
     * @return
     */
    MemberEntity login(String accessTokenInfo);
}

