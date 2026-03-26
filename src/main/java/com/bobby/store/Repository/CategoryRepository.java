package com.bobby.store.Repository;

import com.bobby.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
    List<Category> getCategoryByName(String name);

    List<Category> getAllById(Byte id);
}