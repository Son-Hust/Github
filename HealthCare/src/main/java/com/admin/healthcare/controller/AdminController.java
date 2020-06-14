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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/admin")
public class AdminController {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;

    //Return list Patient
    @RequestMapping("/user-details")
    public String index(Model model) {


        List<User> list = userRepository.findByRole("ROLE_USER");
        model.addAttribute("user", list);


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


        return "admin/user";
    }


    //Return list doctor
    @RequestMapping("/doctor-details")
    public String doctorDetails(Model model) {


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


        List<User> list = userRepository.findByRole("ROLE_DOCTOR");


        // add to the spring model
        model.addAttribute("user", list);


        return "admin/doctor";
    }


    //Return list Doctor
    @RequestMapping("/admin-details")
    public String adminDetails(Model model) {


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


        List<User> list = userRepository.findByRole("ROLE_ADMIN");


        // add to the spring model
        model.addAttribute("user", list);


        return "admin/admin";
    }


    @GetMapping("/add-doctor")
    public String showFormForAdd(Model theModel) {


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


        // create model attribute to bind form data
        User user1 = new User();

        theModel.addAttribute("doctor", user1);

        return "admin/addDoctor";
    }


    @PostMapping("/save-doctor")
    public String saveEmployee(@ModelAttribute("doctor") User user) {


        user.setRole("ROLE_DOCTOR");

        user.setPassword("doctor");
        user.setEnabled(true);

        user.setConfirmationToken("AddByAdmin");

        System.out.println(user);

        userRepository.save(user);

        return "redirect:/admin/doctor-details";
    }


    @GetMapping("/add-admin")
    public String showForm(Model theModel) {


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


        // create model attribute to bind form data
        User user1 = new User();

        theModel.addAttribute("doctor", user1);

        return "admin/addAdmin";
    }


    @PostMapping("/save-admin")
    public String saveEmploye(@ModelAttribute("admin") User user) {

        user.setRole("ROLE_ADMIN");

        user.setPassword("admin");

        System.out.println(user);

        userRepository.save(user);

        return "redirect:/admin/admin-details";
    }

    //Add Patient

    @GetMapping("/add-patient")
    public String showFormAddPatient(Model theModel) {


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


        // create model attribute to bind form data
        User user1 = new User();

        theModel.addAttribute("doctor", user1);

        return "admin/addPatient";
    }


    @PostMapping("/save-patient")
    public String savePatient(@ModelAttribute("patient") User user) {


        user.setRole("ROLE_USER");

        user.setPassword("user");

        user.setEnabled(true);

        user.setConfirmationToken("AddByAdmin");


        System.out.println(user);

        userRepository.save(user);

        return "redirect:/admin/user-details";

    }

    @GetMapping("/edit-my-profile")
    public String EditForm(Model theModel) {

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

        // get the employee from the service

        User user = userRepository.findByEmail(username);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();

        String log = now.toString();

        user.setLastseen(log);

        userRepository.save(user);

        System.out.println(user);

        theModel.addAttribute("profile", user);

        return "admin/updateMyProfile";
    }


    @PostMapping("/update")
    public String update(@ModelAttribute("profile") User user) {


        System.out.println(user);

        userRepository.save(user);

        // use a redirect to prevent duplicate submissions
        return "redirect:/admin/admin-details";
    }


    @RequestMapping("/appointments")
    public String appointments(Model model) {


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


        List<Appointment> list = appointmentRepository.findAll();


        // add to the spring model
        model.addAttribute("app", list);


        return "admin/appointment";
    }

    //Delete user
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id, Model model) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user by Id:" + id));
        userRepository.delete(user);
        model.addAttribute("user", userRepository.findAll());
        return "redirect:/admin/user-details";
    }


    //Update user
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user by Id:" + id));
        model.addAttribute("users", user);
        return "admin/update-patient";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, @Valid User user,
                             Model model) {

        user.setId(id);
        user.setRole("ROLE_USER");
        user.setPassword("user");
        user.setEnabled(true);
        user.setConfirmationToken("AddByAdmin");

        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());
        return "redirect:/admin/user-details";
    }
}

