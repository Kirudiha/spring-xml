package org.kgisl.controller;

import java.util.List;

import org.kgisl.dao.UserDAO;
import org.kgisl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
     
    @Autowired
    private UserDAO userDAO;
     
    @RequestMapping(value="/user")
    public ModelAndView home() {
        List<User> listUsers = userDAO.listUsers();
        ModelAndView model = new ModelAndView("user");
        model.addObject("userList", listUsers);
        return model;
    }
     
}