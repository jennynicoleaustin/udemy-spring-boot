package com.example.workbook31;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Workbook31Controller {

    @GetMapping("/")
    public String getForm (Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "sign-up";
    }

    @GetMapping("/result")
    public String getResult (Model model) {
        return "result";
    }

    @PostMapping("/submitItem")
    public String handleSubmit (@Valid User user, BindingResult result) {
        if (result.hasErrors()) {return "sign-up";}
        return "redirect:/result";
    }
}
