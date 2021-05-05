package com.springGetRest.springGetRest.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springGetRest.springGetRest.Repository.UserRepository;
import com.springGetRest.springGetRest.entity.User;


import javax.validation.Valid;
import java.util.List;
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    
    /*  @PostMapping("/users/register")
   public ResponseEntity<HttpStatus> registerUser(@Valid @RequestBody User newUser) {
        List<User> users = userRepository.findAll();
        System.out.println("New user: " + newUser.toString());
        for (User user : users) {
            System.out.println("Registered user: " + newUser.toString());
            if (user.equals(newUser)) {
                System.out.println("User Already exists!");
                return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);
            }
        }
        userRepository.save(newUser);
        return new ResponseEntity<>(HttpStatus.OK);
    }*/
    @PostMapping("/users/login")
    public @Valid User loginUser(@Valid @RequestBody User user) {
        List<User> users = userRepository.findAll();                
                return userRepository.save(user);
                
            }
       
    } 
  
    


