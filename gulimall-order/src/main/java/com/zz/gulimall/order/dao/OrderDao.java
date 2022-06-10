package com.zz.gulimall.order.dao;

import com.zz.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zz
 * @email 1097449124@qq.com
 * @date 2022-06-10 09:22:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
