package com.atguigu.gulimall.pms.dao;

import com.atguigu.gulimall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangxiang
 * @email 1137647068@qq.com
 * @date 2019-09-21 12:52:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
