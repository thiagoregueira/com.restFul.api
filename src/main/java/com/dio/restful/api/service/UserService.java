package com.dio.restful.api.service;

import com.dio.restful.api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user);
}
