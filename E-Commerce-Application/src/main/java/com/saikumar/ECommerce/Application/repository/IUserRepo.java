package com.saikumar.ECommerce.Application.repository;

import com.saikumar.ECommerce.Application.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {

    User findByUserId(Integer uId);
}
