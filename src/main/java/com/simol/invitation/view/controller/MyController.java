package com.simol.invitation.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class MyController {
    @GetMapping("")
    public String index(Model model) {
        return "index";
    }
}
