package com.bobby.store.Services;

import com.bobby.store.Repository.AddressRepository;
import com.bobby.store.Repository.CategoryRepository;
import com.bobby.store.Repository.ProductRepository;
import com.bobby.store.Repository.UserRepository;
import com.bobby.store.entities.Category;
import com.bobby.store.entities.Product;
import com.bobby.store.entities.User;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@AllArgsConstructor
@Component
public class UserService {
    private final UserRepository userRepository;
    private final AddressRepository addressRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Transactional
    public void showEntityState () {
        var user = User.builder()
                .name("Reo")
                .email("reodejan@gmail.com")
                .password("passwd")
                .build();
    }

    public void showEntityLegend() {
        addressRepository.findById(1L).orElseThrow();
    }

    @Transactional
    public void productAndCategory() {
//        var category = new Category("Cosmetics");
//       var category = categoryRepository.findById((byte)1).orElseThrow();
//
//
//       var product  = Product.builder()
//               .name("facial")
//               .price(BigDecimal.valueOf(50.00))
//               .category(category)
//               .build();
//       productRepository.save(product);

//        var user = userRepository.findById(1L).orElseThrow();
//        var product = productRepository.findAll();
//        product.forEach(user::addFavProduct);
//        userRepository.save(user);
        productRepository.deleteById(5L);




    }

}
