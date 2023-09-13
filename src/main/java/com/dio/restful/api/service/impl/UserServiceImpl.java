package com.dio.restful.api.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.dio.restful.api.domain.model.User;
import com.dio.restful.api.domain.repository.UserRepository;
import com.dio.restful.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists.");
        }
        return userRepository.save(user);
    }

}
