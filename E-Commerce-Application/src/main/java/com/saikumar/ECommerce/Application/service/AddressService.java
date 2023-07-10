package com.saikumar.ECommerce.Application.service;

import com.saikumar.ECommerce.Application.model.Address;
import com.saikumar.ECommerce.Application.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String createAddress(Address address) {
        iAddressRepo.save(address);
        return "Address added";
    }
}
