package com.rolin.pigsale.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rolin.pigsale.entity.DishFlavor;
import com.rolin.pigsale.mapper.DishFlavorMapper;
import com.rolin.pigsale.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService{
}
