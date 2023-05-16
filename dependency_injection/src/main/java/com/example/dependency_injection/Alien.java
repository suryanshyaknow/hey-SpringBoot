package com.example.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Adding the annotation `@component` here will make the following class as a Spring "bean"
 * i.e a Spring object.
 */
@Component
// @Scope(value = "prototype")
public class Alien {

    private int aId;
    private String aName;
    private String tech;

    /*
     * `@Autowired` allows Spring to automatically wire (i.e., inject) dependencies
     * into our classes without the need for explicit instantiation or
     * configuration.
     * 
     * When we annotate a field, constructor, or setter method with @Autowired,
     * Spring will look for a matching bean (i.e., an instance of a class annotated
     * with @Component or related annotations) in its application context and inject
     * it into the annotated field or method parameter.
     */

    @Autowired // --> searches for type
    @Qualifier("laptop") // --> searches for name
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

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

    public void whyHere() {
        System.out.println("To destroy homo-sapiens race apparently to conquer the Earth.");
        laptop.compile();
    }
}
