package com.saikumar.ECommerce.Application.service;

import com.saikumar.ECommerce.Application.model.OrderModel;
import com.saikumar.ECommerce.Application.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public String createOrder(OrderModel order) {
        iOrderRepo.save(order);
        return "Order created";
    }

    public OrderModel getOrderById(Integer oId) {
      return  iOrderRepo.findOrderByOrderId(oId);
    }

    public void deleteOrderById(Integer orderId) {
       iOrderRepo.deleteById(orderId);
    }
}
