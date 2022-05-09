package com.naman.blogapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class securityTestController {

    @GetMapping("/")
    public ResponseEntity<String> all(){
        return new ResponseEntity<>("Open for ALL", HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<String> user(){
        return new ResponseEntity<>("Open for USER", HttpStatus.OK);
    }

    @GetMapping("/admin")
    public ResponseEntity<String> admin(){
        return new ResponseEntity<>("Open for ADMIN", HttpStatus.OK);
    }

}
