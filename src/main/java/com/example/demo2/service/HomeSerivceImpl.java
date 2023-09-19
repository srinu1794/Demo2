package com.example.demo2.service;

import com.example.demo2.repositores.HomeRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeSerivceImpl  implements HomeService{
 Logger logger = LogManager.getLogger(HomeSerivceImpl.class);

    @Autowired
    HomeRepository homeRepository;

    @Override
    public String getHomeDetails() {

        logger.info("calling repository method");
      return   homeRepository.getHomeDetails();

    }
}
