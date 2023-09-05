package com.rolin.pigsale.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rolin.pigsale.entity.OrderDetail;
import com.rolin.pigsale.mapper.OrderDetailMapper;
import com.rolin.pigsale.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
