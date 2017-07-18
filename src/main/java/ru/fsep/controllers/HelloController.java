package ru.fsep.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.fsep.models.User;
import ru.fsep.service.UserService;

/**
 * 09.07.2017
 *
 * @author Robert Bagramov.
 */
@Controller
public class HelloController {
    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String user(@ModelAttribute("model") ModelMap model, @RequestParam(value = "id", required = false) Long id) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "userPage";
    }
}