package com.join.data.service;

import com.join.data.dao.UserRepo;
import com.join.data.model.Product;
import com.join.data.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserServiceImpl implements ServiceUser{

    private UserRepo userRepo;

    @Override
    public List<User> getAllByUsers() {
        return userRepo.getAllByUsers();
    }

    @Override
    public List <Product> getAllByProduct() {
        return userRepo.getAllByProduct();
    }
}
