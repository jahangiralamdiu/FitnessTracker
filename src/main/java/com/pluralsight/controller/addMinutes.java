package com.pluralsight.controller;

import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jahangiralamdiu on 28/09/2014.
 */

@Controller
public class addMinutes {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise")Exercise exercise)
    {
        System.out.println(exercise.getMinutes());

        return "addMinutes";
    }
}
