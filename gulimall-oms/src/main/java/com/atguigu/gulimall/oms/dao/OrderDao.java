package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangxiang
 * @email 1137647068@qq.com
 * @date 2019-09-21 11:39:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
