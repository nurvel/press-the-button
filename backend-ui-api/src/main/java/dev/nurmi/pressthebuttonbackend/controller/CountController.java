package dev.nurmi.pressthebuttonbackend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Math;


@RestController
@RequestMapping("/api/v1")
public class CountController {

    @GetMapping("/count")
    public int getCount(){
        return (int) (Math.random() * 100) + 1;
    }

}
