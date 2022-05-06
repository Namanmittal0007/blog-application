package com.naman.blogapplication.controller;

import com.naman.blogapplication.dto.UserDto;
import com.naman.blogapplication.entity.User;
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

    private final UsersService usersService;

    @Autowired
    public UserController(final UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        ResponseEntity<UserDto> response;
        UserDto responseUserDto= usersService.createUser(userDto);
        response = new ResponseEntity<>(responseUserDto,HttpStatus.OK);
        return response;
    }
}
