package com.Internship.APIRest.repository;

import com.Internship.APIRest.resource.AnimalResource;
import org.springframework.data.repository.CrudRepository;

public interface AnimalsRepository extends CrudRepository<AnimalResource,Long> {
    AnimalResource findByName(String name);
}
