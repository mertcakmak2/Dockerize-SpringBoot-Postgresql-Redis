package com.example.dockerizeapp.Controller.Rest;

import com.example.dockerizeapp.Model.User;
import com.example.dockerizeapp.Service.User.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/get/{id}")
    public User getNewUser(@PathVariable String id){
        return userService.findUserById(id);
    }

    @GetMapping(value = "/getall")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping(value = "")
    public User saveNewUser(@RequestBody User user){

        User newUser = User.builder()
                .name(user.getName())
                .lastName(user.getLastName())
                .age(user.getAge())
                .build();
        return userService.saveUser(newUser);
    }
}
