package com.admin.manager.service;

import com.admin.manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean isUsernameExist(String name) {
        if (name.equals("Sonkk")) {
            return true;
        }
        return false;
    }
}
