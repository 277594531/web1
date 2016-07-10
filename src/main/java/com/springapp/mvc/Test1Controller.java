package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gxwhu on 2016/7/10.
 */
@Controller
@RequestMapping("/Test1")
public class Test1Controller {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        model.addAttribute("message2", "happy");
        model.addAttribute("message3", "sad");
        model.addAttribute("message4", "I am good");
        return "jsp1";
    }
}
