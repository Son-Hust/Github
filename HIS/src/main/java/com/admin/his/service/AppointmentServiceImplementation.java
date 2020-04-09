package com.admin.his.service;

import com.admin.his.entity.Appointment;
import com.admin.his.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppointmentServiceImplementation {

    private AppointmentRepository appointmentRepository;

    //inject employee dao
    @Autowired
    public AppointmentServiceImplementation(@Qualifier("appointmentRepository") AppointmentRepository obj) {
        this.appointmentRepository = obj;
    }


    public void save(Appointment app) {

        appointmentRepository.save(app);
    }


    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }


}
