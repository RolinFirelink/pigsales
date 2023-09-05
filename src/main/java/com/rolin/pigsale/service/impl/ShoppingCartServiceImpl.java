package com.rolin.pigsale.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rolin.pigsale.entity.ShoppingCart;
import com.rolin.pigsale.mapper.ShoppingCartMapper;
import com.rolin.pigsale.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService{
}
