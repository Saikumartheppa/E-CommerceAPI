package com.saikumar.ECommerce.Application.contoller;

import com.saikumar.ECommerce.Application.model.Address;
import com.saikumar.ECommerce.Application.model.OrderModel;
import com.saikumar.ECommerce.Application.model.Product;
import com.saikumar.ECommerce.Application.model.User;
import com.saikumar.ECommerce.Application.service.AddressService;
import com.saikumar.ECommerce.Application.service.OrderService;
import com.saikumar.ECommerce.Application.service.ProductService;
import com.saikumar.ECommerce.Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    OrderService orderService;
    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;
    @Autowired
    AddressService addressService;

    @PostMapping("user")
    public String createUsers(@RequestBody User user)  {
     return   userService.createUser(user);
    }
    @PostMapping("product")
    public String createProduct(@RequestBody Product product)  {
        return  productService.createProduct(product);
    }
    @PostMapping("address")
    public String createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }
    @PostMapping("order")
    public String createOrder(@RequestBody OrderModel order){
        return orderService.createOrder(order);
    }
    @GetMapping("order/{oId}")
    public OrderModel getOrderById(@PathVariable Integer oId){
        return orderService.getOrderById(oId);
    }
    @GetMapping("user/{uId}")
    public User getUserById(@PathVariable Integer uId){
        return userService.getUserById(uId);
    }
    @GetMapping("products/category/{category}")
    public List<Product> getAllProductsByCategory(@PathVariable String category){
        return productService.getAllProductsByCategory(category);
    }
    @DeleteMapping("product/{pId}")
    public String deleteProductById(@PathVariable Integer pId){
        return productService.deleteProductById(pId);
    }
    @DeleteMapping("order")
        public void deleteOrderById(@RequestParam Integer orderId){
         orderService.deleteOrderById(orderId);
    }
}
