package com.csc340.jpademo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author sunny
 */
@Controller
public class AppController {

    @GetMapping({"/", ""})
    public String deleteGoal() {

        return "redirect:/goal/all";
    }
}
