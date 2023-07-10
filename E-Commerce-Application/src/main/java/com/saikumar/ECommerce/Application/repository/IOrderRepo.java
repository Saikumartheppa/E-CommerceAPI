package com.saikumar.ECommerce.Application.repository;

import com.saikumar.ECommerce.Application.model.OrderModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<OrderModel,Integer> {

    OrderModel findOrderByOrderId(Integer oId);
}
