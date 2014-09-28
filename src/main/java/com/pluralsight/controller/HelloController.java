package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jahangiralamdiu on 28/09/2014.
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String sayHally(Model model)
    {
        model.addAttribute("greeting", "Hello Jahangir");
        return "hello";
    }

}
