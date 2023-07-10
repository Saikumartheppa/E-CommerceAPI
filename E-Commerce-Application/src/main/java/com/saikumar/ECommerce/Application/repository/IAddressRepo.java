package com.saikumar.ECommerce.Application.repository;

import com.saikumar.ECommerce.Application.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Integer> {
}
