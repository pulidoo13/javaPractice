package com.Internship.APIRest.resource;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Animals")
public class AnimalResource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String specie;
    private String country;

    public long getId() {
        return id;
    }

    public void setId(long pid) {
        id = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String pSpecie) {
        specie = pSpecie;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String pCountry) {
        country = pCountry;
    }
}
