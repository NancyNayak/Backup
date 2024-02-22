package com.ems.portal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalController {

    @GetMapping("/home")
    public ResponseEntity<String> home(){
        return ResponseEntity.status(HttpStatus.OK).body("Welcome page");
    }
}
