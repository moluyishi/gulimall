package com.atguigu.gulimall.sms.dao;

import com.atguigu.gulimall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhangxiang
 * @email 1137647068@qq.com
 * @date 2019-09-21 11:42:55
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
