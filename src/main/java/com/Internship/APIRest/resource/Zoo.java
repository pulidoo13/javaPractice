package com.Internship.APIRest.resource;



import javax.persistence.*;

@Entity
@Table(name = "Animals_Zoo")
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String zooName;
    private String zooAddres;

    public long getId() {
        return id;
    }

    public void setId(long pid) {
        id = pid;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String pzooName) {
        zooName = pzooName;
    }

    public String getZooAddres() {
        return zooAddres;
    }

    public void setZooAddres(String pzooAddres) {
        zooAddres = pzooAddres;
    }
}
