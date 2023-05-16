package com.example.jpaboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.jpaboot.dao.AlienRepo;
import com.example.jpaboot.model.Alien;

@Controller // marking this class as Controller component
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home() {
        System.out.println("\nHi!\n");
        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien) {
        System.out.println("\nHey!\n");
        repo.save(alien);
        return "home.jsp";
    }

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid) {
        System.out.println("\nFetching an alien by his fuckin' Id...\n");

        ModelAndView mv = new ModelAndView("showAlien.jsp");
        Alien alien = repo.findById(aid).orElse(new Alien()); // fetching an alien by Id
        mv.addObject(alien);
        return mv;
    }

    @RequestMapping("/removeAlien")
    public String removeAlien(@RequestParam int aid) {
        System.out.println("\nRemoving an alien by his freakin' Id...\n");

        repo.deleteById(aid);
        return "home.jsp";
    }
}
