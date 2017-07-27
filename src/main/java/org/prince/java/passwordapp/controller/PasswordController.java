package org.prince.java.passwordapp.controller;

import org.prince.java.passwordapp.repo.PasswordDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by davidprince on 7/25/17.
 */
@Controller
@RequestMapping(value ="")
public class PasswordController {

    @Autowired
    private PasswordDAO passwordDAO;

    public String index(Model model){

        return "index";
    }


}
