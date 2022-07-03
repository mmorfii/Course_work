package com.example.shelter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetsController {

    @GetMapping("/pets")
    public String greeting(Model model) {
        model.addAttribute("title", "Главная страница");
        return "pets";
    }

}