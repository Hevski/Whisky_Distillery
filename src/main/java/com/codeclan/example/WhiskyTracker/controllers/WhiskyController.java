package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping
    public List<Whisky> getAllWhiskies(){
        return whiskyRepository.findAll();
    }

    @GetMapping(value = "/year/{year}")
    public List<Whisky> findAllWhiskyForYear(@PathVariable int year){
        return whiskyRepository.findAllWhiskyByYear(year);
    }

    @GetMapping(value = "/distillery/{distillery}")
    public List<Whisky> findAllWhiskyByDistillery(@PathVariable String distillery){
        return whiskyRepository.findAllWhiskyByDistillery(distillery);
    }

    @GetMapping(value = "/find/{distilleryId}/{age}")
    public List<Whisky> findWhiskyByDistilleryByYear(@PathVariable Long distilleryId, @PathVariable int age){
        return whiskyRepository.findWhiskyByDistilleryIdAndAge(distilleryId, age);
    }

    @GetMapping(value = "/region/{region}")
    public List<Whisky> findWhiskyByDistilleryRegion(@PathVariable String region){
        return whiskyRepository.findWhiskyByDistilleryRegion(region);
    }
}
