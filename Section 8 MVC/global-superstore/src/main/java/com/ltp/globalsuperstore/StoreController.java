package com.ltp.globalsuperstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StoreController {
    private List<Item> items = new ArrayList<>();
    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("categories", Constants.CATEGORIES);
        model.addAttribute("item", new Item());
        return "form";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model) {
        return "inventory";
    }
@PostMapping("/submitItem")
    public String submitOrderForm (Item item) {
        items.add(item);
        return "redirect:/inventory";
    }
}
