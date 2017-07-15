package ru.fsep.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 09.07.2017
 *
 * @author Robert Bagramov.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }
}