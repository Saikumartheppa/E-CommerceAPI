package com.saikumar.ECommerce.Application.service;

import com.saikumar.ECommerce.Application.model.Product;
import com.saikumar.ECommerce.Application.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;
    public String createProduct(Product product) {
     iProductRepo.save(product);
     return "product Created";
    }

    public List<Product> getAllProductsByCategory(String category) {
     return iProductRepo.findProductsByproductCategory(category);
    }

    public String deleteProductById(Integer pId) {
        if(iProductRepo.existsById(pId)) {
            iProductRepo.deleteById(pId);
            return "product Deleted";
        }
        return "No such Product Exist!!";
    }
}
