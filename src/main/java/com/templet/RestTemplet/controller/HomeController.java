package com.templet.RestTemplet.controller;

import com.templet.RestTemplet.entity.User;
import com.templet.RestTemplet.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ServiceLayer serviceLayer;

    @Autowired
    public HomeController(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    @GetMapping("/home")
    public ResponseEntity<User> homerest()
    {
        return new ResponseEntity<>( serviceLayer.consumeApi(), HttpStatus.OK);
    }
}
