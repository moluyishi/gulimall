package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangxiang
 * @email 1137647068@qq.com
 * @date 2019-09-21 11:45:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
