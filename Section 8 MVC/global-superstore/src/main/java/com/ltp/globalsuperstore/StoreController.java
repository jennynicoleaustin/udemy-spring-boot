package com.ltp.globalsuperstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StoreController {
    private List<Item> items = new ArrayList<>();

    @GetMapping("/inventory")
    public String getInventory(Model model) {
        model.addAttribute("items", items);
        return "inventory";
    }
    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        Item item;
        int index = findItemIndex(id);
        model.addAttribute("item", index == Constants.NOT_FOUND ? new Item() : items.get(index));
        model.addAttribute("categories", Constants.CATEGORIES);
        return "form";
    }

@PostMapping("/submitItem")
    public String submitOrderForm (Item item) {
        int index = findItemIndex(item.getId());
    if (index == Constants.NOT_FOUND) {
        items.add(item);
    } else {
        items.set(index, item);
    }
    return "redirect:/inventory";
    }
    public int findItemIndex (String id) {
        for (int i = 0; i < items.size(); i++)
            if (items.get(i).getId().equals(id)) {
                return i;
            }
        return Constants.NOT_FOUND;
    }
}
