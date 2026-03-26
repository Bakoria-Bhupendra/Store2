package com.bobby.store;

import com.bobby.store.Repository.UserRepository;
import com.bobby.store.Services.UserService;
import com.bobby.store.entities.Address;
import com.bobby.store.entities.Profile;
import com.bobby.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var service = context.getBean(UserService.class);

        service.productAndCategory();






    }
}
