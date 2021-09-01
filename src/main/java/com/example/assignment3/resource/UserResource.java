package com.example.assignment3.resource;


import com.example.assignment3.exception.NameException;
import com.example.assignment3.model.User;
import com.example.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody @Valid User user) throws NameException {
        if(user.getName().equalsIgnoreCase("root")){
            throw new NameException();
        }
        return userService.saveUser(user);
    }

    @ExceptionHandler(NameException.class)
    public String nameError(NameException ex){
        return ex.getMessage();
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @GetMapping("/byID")
    public List<User> getById(@RequestParam(name = "id") String id) {
        return userService.getById(id);
    }



    @PutMapping
    public User updateUser( @RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userId") String userId) {
        userService.deleteUser(userId);
    }


}
