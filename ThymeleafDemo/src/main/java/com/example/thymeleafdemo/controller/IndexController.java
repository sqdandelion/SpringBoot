package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) i);
            user.setName("同学" + i);
            user.setAddress("北京" + i);
            users.add(user);
        }
        model.addAttribute("users", users);
        return "index";
    }

}
