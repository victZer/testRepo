package com.join.data;

import com.join.data.dao.ProductRepo;
import com.join.data.dao.UserRepo;
import com.join.data.model.Product;
import com.join.data.model.User;
import com.join.data.service.ServiceUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
public class DataApplication {

    List<Product> productList = new ArrayList<>();{
        productList.add(new Product("Iphone"));
        productList.add(new Product("Galaxy"));
        productList.add(new Product("Huaway"));
    }

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepo repository, ProductRepo productRepo) {
        return (args) -> {
            // save a few users

           log.info("________________________________________________________");
            repository.save(new User("Boris","bor@gamil",productList));
            repository.save(new User("Evgeniy","evgen@gamil"));

            // fetch all users
            log.info("Users found with getAllByUsers():");
            log.info("-------------------------------");
            for (User user : repository.getAllByUsers()) {
                log.info(user.toString());
            }
            log.info("");

            log.info("Product found with getAllByProduct()");
            log.info("_______________________________________");


            for (Product product : repository.getAllByProduct()) {
                log.info(product.toString());
            }

        };
    }

}
