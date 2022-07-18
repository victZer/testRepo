package com.join.data.dao;

import com.join.data.model.Product;
import com.join.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u")
    List<User> getAllByUsers();
    @Query("SELECT p FROM User u JOIN u.product p")
   List <Product> getAllByProduct();
}
