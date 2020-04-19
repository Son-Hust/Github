package com.admin.healthcare.repository;

import com.admin.healthcare.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {


}