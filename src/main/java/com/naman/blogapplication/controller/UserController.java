package com.naman.blogapplication.controller;

import com.naman.blogapplication.entity.Users;
import com.naman.blogapplication.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UsersService usersService;

//    @Autowired
//    public UserController(final UsersService usersService) {
//        this.usersService = usersService;
//    }

    @PostMapping("/")
    public ResponseEntity<String> createUser(@RequestBody Users user){
        try{
            usersService.createUser(user);
            return new ResponseEntity<>("",HttpStatus.OK);
        }
        catch (Exception e){
//            System.out.print(ExceptionUtils.getStackTrace(e));
            e.printStackTrace();
            return new ResponseEntity<>("",HttpStatus.BAD_REQUEST);
        }
    }
}
