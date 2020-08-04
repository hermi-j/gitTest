package com.example.demo.service;

import com.example.demo.dto.RecipeDto;
import com.example.demo.entity.Recipes;
import com.example.demo.entity.Step;
import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.Set;

@Service
public class RecipeService {
    private UserRepository userRepository;

    @Autowired
    public RecipeService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(RecipeDto dto) {
        Recipes recipe = new Recipes();
        recipe.setDateOfCreation(new Date().toString());

//add user
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Users users = userRepository.findByUsername(authentication.getName());
        recipe.setUsers(Collections.singleton(users));

        //step

        dto.getStepDtos().stream().map(stepDto -> new Step(stepDto))

    }
}
