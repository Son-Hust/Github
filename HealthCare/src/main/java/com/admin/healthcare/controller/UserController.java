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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;


    @GetMapping("/index")
    public String index(Model model) {

        // get last seen
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
            String Pass = ((UserDetails) principal).getPassword();
            System.out.println("One + " + username + "   " + Pass);


        } else {
            username = principal.toString();
            System.out.println("Two + " + username);
        }

        User user = userRepository.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log = now.toString();

        user.setLastseen(log);

        userRepository.save(user);


        Appointment obj = new Appointment();

        obj.setName(user.getFirstName() + " " + user.getLastName());

        obj.setEmail(user.getEmail());

        System.out.println(obj);

        model.addAttribute("app", obj);

        return "user/index";
    }

    @PostMapping("/save-app")
    public String saveEmploye(@ModelAttribute("app") Appointment obj) {

        appointmentRepository.save(obj);


        // use a redirect to prevent duplicate submissions
        return "redirect:/user/index";
    }


    @GetMapping("/about")
    public String about(Model model) {

        // get last seen
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
            String Pass = ((UserDetails) principal).getPassword();
            System.out.println("One + " + username + "   " + Pass);


        } else {
            username = principal.toString();
            System.out.println("Two + " + username);
        }

        User user = userRepository.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log = now.toString();

        user.setLastseen(log);

        userRepository.save(user);


        Appointment obj = new Appointment();

        obj.setName(user.getFirstName() + " " + user.getLastName());

        obj.setEmail(user.getEmail());

        System.out.println(obj);

        model.addAttribute("app", obj);

        return "user/about";
    }

    @GetMapping("/blog-single")
    public String bs(Model model) {

        // get last seen
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
            String Pass = ((UserDetails) principal).getPassword();
            System.out.println("One + " + username + "   " + Pass);


        } else {
            username = principal.toString();
            System.out.println("Two + " + username);
        }

        User user = userRepository.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log = now.toString();

        user.setLastseen(log);

        userRepository.save(user);


        Appointment obj = new Appointment();

        obj.setName(user.getFirstName() + " " + user.getLastName());

        obj.setEmail(user.getEmail());

        System.out.println(obj);

        model.addAttribute("app", obj);

        return "user/blog-single";
    }

    @GetMapping("/blog")
    public String blog(Model model) {

        // get last seen
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
            String Pass = ((UserDetails) principal).getPassword();
            System.out.println("One + " + username + "   " + Pass);


        } else {
            username = principal.toString();
            System.out.println("Two + " + username);
        }

        User user = userRepository.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log = now.toString();

        user.setLastseen(log);

        userRepository.save(user);


        Appointment obj = new Appointment();

        obj.setName(user.getFirstName() + " " + user.getLastName());

        obj.setEmail(user.getEmail());

        System.out.println(obj);

        model.addAttribute("app", obj);

        return "user/blog";
    }

    @GetMapping("/contact")
    public String contact(Model model) {

        // get last seen
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
            String Pass = ((UserDetails) principal).getPassword();
            System.out.println("One + " + username + "   " + Pass);


        } else {
            username = principal.toString();
            System.out.println("Two + " + username);
        }

        User user = userRepository.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log = now.toString();

        user.setLastseen(log);

        userRepository.save(user);


        Appointment obj = new Appointment();

        obj.setName(user.getFirstName() + " " + user.getLastName());

        obj.setEmail(user.getEmail());

        System.out.println(obj);

        model.addAttribute("app", obj);

        return "user/contact";
    }


    @GetMapping("/department-single")
    public String d(Model model) {

        // get last seen
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
            String Pass = ((UserDetails) principal).getPassword();
            System.out.println("One + " + username + "   " + Pass);


        } else {
            username = principal.toString();
            System.out.println("Two + " + username);
        }

        User user = userRepository.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log = now.toString();

        user.setLastseen(log);

        userRepository.save(user);


        Appointment obj = new Appointment();

        obj.setName(user.getFirstName() + " " + user.getLastName());

        obj.setEmail(user.getEmail());

        System.out.println(obj);

        model.addAttribute("app", obj);


        return "user/department-single";
    }

    @GetMapping("/departments")
    public String dep(Model model) {

        // get last seen
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
            String Pass = ((UserDetails) principal).getPassword();
            System.out.println("One + " + username + "   " + Pass);


        } else {
            username = principal.toString();
            System.out.println("Two + " + username);
        }

        User user = userRepository.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log = now.toString();

        user.setLastseen(log);

        userRepository.save(user);


        Appointment obj = new Appointment();

        obj.setName(user.getFirstName() + " " + user.getLastName());

        obj.setEmail(user.getEmail());

        System.out.println(obj);

        model.addAttribute("app", obj);

        return "user/departments";
    }

    @GetMapping("/doctor")
    public String doctor(Model model) {

        // get last seen
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
            String Pass = ((UserDetails) principal).getPassword();
            System.out.println("One + " + username + "   " + Pass);


        } else {
            username = principal.toString();
            System.out.println("Two + " + username);
        }

        User user = userRepository.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log = now.toString();

        user.setLastseen(log);

        userRepository.save(user);


        Appointment obj = new Appointment();

        obj.setName(user.getFirstName() + " " + user.getLastName());

        obj.setEmail(user.getEmail());

        System.out.println(obj);

        model.addAttribute("app", obj);


        return "user/doctor";
    }
}
