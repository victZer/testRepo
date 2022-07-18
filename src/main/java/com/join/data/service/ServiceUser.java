package com.join.data.service;

import com.join.data.model.Product;
import com.join.data.model.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServiceUser {
    List<User> getAllByUsers();

   List <Product> getAllByProduct();
}
