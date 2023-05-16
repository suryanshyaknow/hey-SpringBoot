package com.example.mywebapp;

// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int aId;
    private String aName;
    private String tech;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Alien() {
        System.out.println("An alien arrived at Earth!");
    }

    public Alien(int aId, String aName, String tech) {
        this.aId = aId;
        this.aName = aName;
        this.tech = tech;

        System.out.println("An alien who's known as " + aName + " in inter galaxy arrived at Earth!");
    }

}