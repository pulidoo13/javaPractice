package com.Internship.APIRest.controller;

import com.Internship.APIRest.exception.PreconditionFailedException;
import com.Internship.APIRest.resource.AnimalResource;
import com.Internship.APIRest.service.AnimalService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private static final Logger LOG = LoggerFactory.getLogger(AnimalController.class);
    @Autowired
    private AnimalService animalService;
    @GetMapping("/")
    public List<AnimalResource> getAnimals() {
        return animalService.getAnimals();
    }

    @GetMapping("/{id}")
    public AnimalResource getAnimals(@PathVariable(name = "id")long pId) {
        AnimalResource animals = new AnimalResource();
        animals.setId(pId);
        animals.setName("Lion");
        animals.setSpecie("Felidae");
        animals.setCountry("Africa");

        return animals;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)

    public void createAnimal(@RequestBody AnimalResource animalResource){
        AnimalResource animals = new AnimalResource();
        animals.setName("Lion");
        animals.setSpecie("Felidae");
        animals.setCountry("Africa");

        LOG.info(animalResource.toString());
        LOG.info("{}",animalResource);

    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateAnimals(@PathVariable(name = "id")long pId) {
        AnimalResource animals = new AnimalResource();
        animals.setId(pId);
        animals.setName("Lion");
        animals.setSpecie("Felidae");
        animals.setCountry("Africa");
    }


    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletedAnimal() {

        return;
    }

    @ExceptionHandler({PreconditionFailedException.class})
    @ResponseStatus(HttpStatus.PRECONDITION_FAILED)
    public  void preException(){
    LOG.info("Precondition FAILED");
    }

}
