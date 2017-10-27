package com.Internship.APIRest.resource;

public class AnimalResource {

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
