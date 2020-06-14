package com.admin.his.repository;

import com.admin.his.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("adminRepository")
public interface AdminRepository extends JpaRepository<Admin, Long> {

    Admin findByEmail(String user);

    List<Admin> findByRole(String user);
}