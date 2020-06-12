package dev.nurmi.pressthebuttonbackend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/v1")
public class CountController {

    Logger logger = LoggerFactory.getLogger(CountController.class);

    @GetMapping("/count")
    public int getCount(){
        logger.info("/count called");
        return (int) (Math.random() * 100) + 1;
    }

}
