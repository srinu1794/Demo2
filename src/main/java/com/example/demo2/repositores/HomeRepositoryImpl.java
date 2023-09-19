package com.example.demo2.repositores;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class HomeRepositoryImpl implements HomeRepository{
    Logger logger = LogManager.getLogger(HomeRepositoryImpl.class);

    @Override
    public String getHomeDetails() {
        logger.info("print home details");
        return "home: 2/12";
    }

}
