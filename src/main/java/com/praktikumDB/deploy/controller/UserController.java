package com.praktikumDB.deploy.controller;

import com.praktikumDB.deploy.service.UserService;
import com.praktikumDB.deploy.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    private final UserService userService;

    public userController(UserService userService) {
        this.userService = UserService;
    }

    @PostMapping
    public String createUser(@RequestBody User request){
        return "user created successfully";
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/id")
    public String deleteUser(@PathVariable String Id){
        userService.deleteUser(id);
        return "user deleted successfully";
    }

    @PutMapping("/id")
    public String updateUser(@PathVariable String id, @RequestBody User request) {
        userService.updateUser(id, request);
        return "user updated succesfully";
    }
}

