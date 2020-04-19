package com.admin.healthcare.repository;

import com.admin.healthcare.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {


    User findByEmail(String email);

    List<User> findAll();

    List<User> findByRole(String role);
}