package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.User;
import com.airhub.stepbystep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Web controller to display users in JSP view.
 */
@Controller
public class UsuarioWebController {

    @Autowired
    private UserService userService;

    @GetMapping("/usuarios-web")
    public String showUsers(Model model) {

        List<User> users = userService.getAllUsers();

        model.addAttribute("usuarios", users);

        return "usuarios";
    }
}