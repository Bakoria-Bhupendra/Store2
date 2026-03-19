package com.bobby.store;

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
        var user = User.builder()
                .name("Bobby")
                .password("1234L")
                .email("bobby@gmail.com")
                .password("12345")
                .build();

        var address = Address.builder()
                .city("Yokohama")
                .zip("123")
                .state("Ohio")
                .street("Church street")
                .build();

        var profile = Profile.builder()
                        .bio("Mine")
                        .build();

        user.addTag("tag1");
        user.addAddresses(address);
        user.setProfile(profile);
        profile.setUser(user);
        System.out.println(user);
    }

}
