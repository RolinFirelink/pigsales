package com.rolin.pigsale.dto;

import com.rolin.pigsale.entity.OrderDetail;
import com.rolin.pigsale.entity.Orders;
import lombok.Data;

import java.util.List;

@Data
public class OrdersDto extends Orders {

    //记录订单的数量
    private Integer sumNum;

    //记录下单用户的名字
    private String consignee;

    //记录订单中具体的菜品
    private List<OrderDetail> orderDetails;
}
