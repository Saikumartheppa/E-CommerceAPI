package com.saikumar.ECommerce.Application.repository;

import com.saikumar.ECommerce.Application.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {

    List<Product> findProductsByproductCategory(String category);
}
