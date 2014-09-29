package com.pluralsight.controller;

import com.pluralsight.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

/**
 * Created by lenovo on 29/09/2014.
 */
@Controller
@SessionAttributes("goal")
public class GoalController {

    @RequestMapping(value = "addGoal", method = RequestMethod.GET)
    public String addGoal(Model model)
    {
        model.addAttribute("goal", new Goal());

        return "addGoal";
    }

    @RequestMapping(value = "addGoal", method = RequestMethod.POST)
    public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result)
    {
        System.out.println(goal.getMinutes());

        if(result.hasErrors())
        {
            return "addGoal";
        }

        return "redirect:addMinutes.html";
    }
}
