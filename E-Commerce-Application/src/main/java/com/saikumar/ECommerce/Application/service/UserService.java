package com.saikumar.ECommerce.Application.service;

import com.saikumar.ECommerce.Application.model.User;
import com.saikumar.ECommerce.Application.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public String createUser(User user) {
        iUserRepo.save(user);
        return "Users added";
    }

    public User getUserById(Integer uId) {
      return iUserRepo.findByUserId(uId);
    }
}
