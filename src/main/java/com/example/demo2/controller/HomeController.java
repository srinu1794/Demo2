package com.example.demo2.controller;


import com.example.demo2.models.Home;
import com.example.demo2.service.HomeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    Logger logger = LogManager.getLogger(HomeController.class);

    @Autowired
    HomeService homeService;

    @GetMapping("/details")
    public String getMessage(){
     logger.info("calling service method");
        return homeService.getHomeDetails();
    }

    @PostMapping("/details")
    public String save(@RequestBody Home home){
        logger.info("home mode {}",home.getPinCode());
        return "succssfully save";
    }
}
