package com.admin.his.service;

import com.admin.his.entity.Admin;

import java.util.List;

public interface AdminService {


    public List<Admin> findByRole(String user);

    public Admin findByEmail(String user);

    public List<Admin> findAll();

    public void save(Admin admin);

}
