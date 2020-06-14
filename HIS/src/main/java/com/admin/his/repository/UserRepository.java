package com.admin.his.repository;

import com.admin.his.entity.Admin;
import com.admin.his.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {


    User findByEmail(String email);

    User findByConfirmationToken(String confirmationToken);

    List<User> findAll();

    List<User> findByRole(String role);
}