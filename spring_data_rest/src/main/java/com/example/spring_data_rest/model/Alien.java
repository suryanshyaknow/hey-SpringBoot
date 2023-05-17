package com.example.spring_data_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Alien {

    @Id // Insinuating that the following field i.e 'aid' shall be treated as primary key
    // @GeneratedValue
    private int aid;
    private String aname;
    private String tech;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
    }

}
