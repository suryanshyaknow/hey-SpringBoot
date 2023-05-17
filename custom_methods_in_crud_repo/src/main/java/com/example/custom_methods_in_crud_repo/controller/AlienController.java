package com.example.custom_methods_in_crud_repo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.custom_methods_in_crud_repo.dao.AlienRepo;
import com.example.custom_methods_in_crud_repo.model.Alien;

import ch.qos.logback.core.model.Model;

@RestController // Equivalent to mentioning `@ResponseBody` everywhere!
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public ModelAndView home() {

        ModelAndView mv = new ModelAndView("home.jsp");
        System.out.println("\nHi!\n");
        return mv;

    }

    // Handling POST Request
    @PostMapping(path = "/alien", consumes = { "application/json" }) // Can submit data via the POST method!
    public Alien addAlien(@RequestBody Alien alien) {

        System.out.println("\nHey!\n");
        repo.save(alien);
        return alien;

    }

    // @RequestMapping("/getAlien")
    // public ModelAndView getAlien(@RequestParam int aid) {
    // System.out.println("\nFetching an alien by his fuckin' Id...\n");

    // ModelAndView mv = new ModelAndView("showAlien.jsp");
    // Alien alien = repo.findById(aid).orElse(new Alien()); // fetching an alien by
    // Id

    // System.out.println(repo.findByTech("Java"));
    // System.out.println(repo.findByAidGreaterThan(99));
    // System.out.println(repo.findByTechSorted("Java"));

    // mv.addObject(alien);
    // return mv;
    // }

    /*
     * Now, rather than passing our request to the URL or in the forms each time,
     * let's see how we could implement REST services.
     */

    // @RequestMapping("/aliens")
    // @ResponseBody // To actually return the values rather than the page
    // public String getAliens() {
    // return repo.findAll().toString();
    // }

    // Handling GET Request
    @GetMapping(path = "/aliens", produces = { "application/xml" }) // Will produce only `xml` content
    // @ResponseBody // To actually return the values rather than the page
    public List<Alien> getAliens() {

        return repo.findAll(); // Shall display the data in a json format

    }

    // @RequestMapping("/aliens/{aid}")
    // @ResponseBody
    // public String getAlien(@PathVariable("aid") int aid) {
    // System.out.println("\nYessir!\n");
    // return repo.findById(aid).toString();
    // }

    @RequestMapping("/alien/{aid}")
    // @ResponseBody
    public Optional<Alien> getAlien(@PathVariable("aid") int aid) {

        System.out.println("\nYessir!\n");
        return repo.findById(aid);

    }

    // Handling PUT Request
    @PutMapping(path = "/alien", consumes = { "application/json" })
    public Alien addOrUpdateAlien(@RequestBody Alien alien) {

        System.out.println("\nAye!\n");
        repo.save(alien);
        return alien;

    }

    // Handling DELETE Request
    @DeleteMapping("/alien/{aid}")
    public ModelAndView deleteAlien(@PathVariable int aid) {

        System.out.println("Obliterating that mf...");
        Alien al = repo.findById(aid).orElse(null);
        repo.delete(al);

        return new ModelAndView("redirect:/aliens");
    }
}
