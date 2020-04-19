package com.admin.healthcare.controller;

import com.admin.healthcare.entity.Appointment;
import com.admin.healthcare.entity.User;
import com.admin.healthcare.repository.AppointmentRepository;
import com.admin.healthcare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;



    @RequestMapping("/index")
    public String index(Model model){



        // get last seen
        String username="";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername();
            String Pass = ((UserDetails)principal).getPassword();
            System.out.println("One + "+username+"   "+Pass);


        } else {
            username = principal.toString();
            System.out.println("Two + "+username);
        }

        User user = userRepository.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log=now.toString();

        user.setLastseen(log);

        userRepository.save(user);



        List<Appointment> list=appointmentRepository.findAll();

        model.addAttribute("name",user.getFirstName());

        model.addAttribute("email",user.getEmail());


        model.addAttribute("user",user.getFirstName()+" "+user.getLastName());

        // add to the spring model
        model.addAttribute("app", list);

        return "doctor/index";
    }


}
