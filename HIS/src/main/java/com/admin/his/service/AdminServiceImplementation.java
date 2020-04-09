package com.admin.his.service;

import com.admin.his.entity.Admin;
import com.admin.his.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminServiceImplementation implements AdminService {

    private AdminRepository adminRepository;

    //inject employee dao
    @Autowired
    public AdminServiceImplementation(@Qualifier("adminRepository") AdminRepository obj) {
        this.adminRepository = obj;
    }

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public void save(Admin admin) {

        adminRepository.save(admin);
    }

    @Override
    public Admin findByEmail(String user) {

        return adminRepository.findByEmail(user);

    }

    @Override
    public List<Admin> findByRole(String user) {

        return adminRepository.findByRole(user);
    }


}
