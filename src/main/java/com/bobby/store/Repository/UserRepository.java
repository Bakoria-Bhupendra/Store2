package com.bobby.store.Repository;

import com.bobby.store.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}