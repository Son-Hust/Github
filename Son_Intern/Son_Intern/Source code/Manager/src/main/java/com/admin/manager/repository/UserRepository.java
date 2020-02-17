package com.admin.manager.repository;

import com.admin.manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> registeredUsers = new LinkedList<>();
    default Optional<User> findByName(String name){
        return registeredUsers.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst();
    }
}
