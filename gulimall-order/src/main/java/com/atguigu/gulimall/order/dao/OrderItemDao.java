package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author buelev
 * @email 172319516@qq.com
 * @date 2020-07-02 01:22:08
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
