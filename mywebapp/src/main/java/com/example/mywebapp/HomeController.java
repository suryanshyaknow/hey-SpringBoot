package com.example.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// import ch.qos.logback.core.model.Model;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;
// import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    /*
     * We have Dispatcher Servlet i.e. "Front Controller" behind the scenes that'd
     * be responsible for sending requests here.
     */

    // @RequestMapping("home") // Calling the 'home' page
    // public String home(HttpServletRequest req, HttpServletResponse res) {

    //     HttpSession session = req.getSession();
    //     String name = req.getParameter("name"); // accessing user inputs via a session
    //     System.out.println("\nHi! " + name + ".\n");

    //     session.setAttribute("name", name);
    //     return "home"; // Return the logical view name without the file extension
    // }

    // @RequestMapping("home") // Calling the 'home' page
    // public String home(@RequestParam("myName") String name, HttpSession session) {
    //     System.out.println("\nHi! " + name + ".\n");

    //     session.setAttribute("name", name);
    //     return "home"; // Return the logical view name without the file extension
    // }

    // // Leveraging the competency of Spring Boot
    // @RequestMapping("home") // Calling the 'home' page
    // public ModelAndView home(@RequestParam("myName") String name) {

    //     ModelAndView mv = new ModelAndView();
    //     mv.addObject("name", name);
    //     mv.setViewName("home");

    //     return mv;
    // }

    // Expecting an object from the Client
    @RequestMapping("home") // Calling the 'home' page
    public ModelAndView home(Alien alien) {

        ModelAndView mv = new ModelAndView();
        mv.addObject("alienObj", alien);
        mv.setViewName("home");

        return mv;
    }
}
