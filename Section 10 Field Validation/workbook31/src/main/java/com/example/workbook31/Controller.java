package com.example.workbook31;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller

public class Controller {

    @GetMapping
    public String getForm () {
        return "sign-up";
    }

    @GetMapping
    public String getResult () {
        return "result";
    }

}
