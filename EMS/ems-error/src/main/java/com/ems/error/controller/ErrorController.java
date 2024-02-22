package com.ems.error.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @GetMapping("/error")
    public ResponseEntity<String> home(){
        return ResponseEntity.status(HttpStatus.OK).body("Error page");
    }
}
