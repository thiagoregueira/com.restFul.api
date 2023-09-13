package com.dio.restful.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.restful.api.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
