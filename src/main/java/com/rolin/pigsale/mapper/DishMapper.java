package com.rolin.pigsale.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rolin.pigsale.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
