package com.nckgr.spring.crud.controller;



import com.nckgr.spring.crud.entity.User;
import com.nckgr.spring.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String showUsers (Model model) {

        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping(value = "/addNewUser")
    public String addNewUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "user-info";
    }

    @PostMapping(value = "/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {

        userService.saveUser(user);

        return "redirect:/";
    }

    @GetMapping(value = "/updateUser")
    public String updateUser(@RequestParam("userId") int id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);

        return "user-info";
    }

//    @GetMapping("/edit/{id}")
//    public String showUpdateForm(@PathVariable("id") int id, Model model) {
//        User user = userService.getUser(id);
//        model.addAttribute("user", user);
//        return "update-user";
//    }
//
//    @PostMapping("/update/{id}")
//    public String updateUser(@PathVariable("id") int id, User user,BindingResult result, Model model) {
//        userService.updateUser(user);
//        return "redirect:/";
//    }

    @GetMapping(value = "/deleteUser")
    public String deleteUser(@RequestParam("userId") int id) {

        userService.deleteUser(id);

        return "redirect:/";
    }

}
