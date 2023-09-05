package com.rolin.pigsale.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rolin.pigsale.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
}
