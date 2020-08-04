package com.example.demo.controller;

import com.example.demo.dto.RecipeDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecipesController {

    @PostMapping("/create")
    public ModelAndView create(ModelAndView modelAndView, RecipeDto recipeDto) {

    }
}
