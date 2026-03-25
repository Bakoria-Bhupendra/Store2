package com.bobby.store.Repository;

import com.bobby.store.entities.Address;
import org.springframework.data.repository.ListCrudRepository;

public interface AddressRepository extends ListCrudRepository<Address, Long> {

}