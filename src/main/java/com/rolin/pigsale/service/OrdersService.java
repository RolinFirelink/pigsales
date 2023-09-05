package com.rolin.pigsale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rolin.pigsale.entity.Orders;

public interface OrdersService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);

    /**
     * 用户再来一单
     * @param orders
     */
    public void again(Orders orders);
}
