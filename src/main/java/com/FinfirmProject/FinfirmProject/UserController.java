package com.FinfirmProject.FinfirmProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public String createUser(@RequestParam String username){
        userService.createUser(username);
        return "User created successfully";

    }

    public String deleteUser(@RequestParam String username){
        userService.deleteUser(username);
        return "User Deleted SuccessFully";
    }
}
