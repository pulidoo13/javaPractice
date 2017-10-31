package com.Internship.APIRest.service.impl;

import com.Internship.APIRest.repository.AnimalsRepository;
import com.Internship.APIRest.resource.AnimalResource;
import com.Internship.APIRest.service.AnimalService;
import com.Internship.APIRest.exception.PreconditionFailedException;
import com.Internship.APIRest.exception.ConflictException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {


    private AnimalsRepository animalsRepository;

    @Override
    public List<AnimalResource> getAnimals() {
        List<AnimalResource> animalResources = new ArrayList<>();
        animalsRepository.findAll().forEach(animalResources::add);
        return animalResources;
    }

    @Override
    public AnimalResource createAnimal(AnimalResource animalResource) {
        if (rudeWord(animalResource.getName())) {
            throw new PreconditionFailedException("This is not a Animal");
        } else if (isExists(animalResource)) {
            throw new ConflictException("Name already exists!");
        }

        return null;
    }

    private boolean isExists(AnimalResource animalResource1){
        AnimalResource animalResource = animalsRepository.findByName(animalResource1.getName());
        if (animalResource == null) {
            return false;
        }
        return true;
    }

    private  boolean rudeWord(String pWord){
        return pWord.equalsIgnoreCase("badWord");
    }

    @Autowired
    public void setAnimalsRepository(AnimalsRepository animalsRepository) {
        this.animalsRepository = animalsRepository;
    }
}
