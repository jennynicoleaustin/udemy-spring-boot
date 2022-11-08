package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkbookController {

    @GetMapping("/shows")
    public String getShows(Model model) {
        Show first = new Show("Breaking Bad", "Ozymandias", 10.0);
        model.addAttribute("first", first);
        Show second = new Show("Attack on Titan", "Perfect Game", 9.9);
        model.addAttribute("second", second);
        Show third = new Show("Attack on Titan", "Perfect Game", 9.9);
        model.addAttribute("third", third);
        Show fourth = new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9);
        model.addAttribute("fourth", fourth);
        Show fifth = new Show("Mr. Robot", "407 Proxy Authentication Required ", 9.9);
        model.addAttribute("fifth", fifth);
        return "shows";
    }

}
