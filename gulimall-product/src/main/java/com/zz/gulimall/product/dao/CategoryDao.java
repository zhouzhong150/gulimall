package com.zz.gulimall.product.dao;

import com.zz.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zz
 * @email 1097449124@qq.com
 * @date 2022-06-09 18:24:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
