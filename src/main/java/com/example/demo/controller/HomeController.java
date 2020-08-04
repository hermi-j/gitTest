package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;

@Controller

public class HomeController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public ModelAndView home(ModelAndView view) {
        //userRepository.findByUsername("milka_way");
        view.setViewName("home");
        return view;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLogin(ModelAndView view, UserDto userDto) {
        view.setViewName("login");
        view.addObject("userDto", userDto);
        return view;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView authenticate(ModelAndView view, UserDto userDto, BindingResult bindingResult, Model model) throws Exception {
        userService.login(userDto);
        view.setViewName("recipes");
        return view;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView getRegisterForm(ModelAndView view, UserDto userDto) {
        view.addObject("userDto", userDto);
        view.setViewName("registration");
        return view;
    }

    @PostMapping("/registration")
    public ModelAndView addUser(UserDto userForm, ModelAndView model) throws Exception {
//        BeanUtils.copyProperties(userForm,user);
        Users user= new Users(userForm);
        user.setActive(true);
        userService.saveUser(user);
        model.setViewName("login");
        return model;
    }
    @GetMapping("/recipes")
    public ModelAndView recipes(ModelAndView view) {
        view.setViewName("recipes");
        return view;
    }
}
