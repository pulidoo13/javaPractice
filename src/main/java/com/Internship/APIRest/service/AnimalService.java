package com.Internship.APIRest.service;

import com.Internship.APIRest.resource.AnimalResource;

import java.util.List;

public interface AnimalService {
    List<AnimalResource> getAnimals();
    AnimalResource createAnimal(AnimalResource animalResource);

}
