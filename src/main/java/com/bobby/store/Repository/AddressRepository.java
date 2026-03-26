package com.bobby.store.Repository;

import com.bobby.store.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

}