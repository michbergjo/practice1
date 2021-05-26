package com.sca.practice1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/greeting", method = RequestMethod.GET)
public class HelloController<id> {


    @RequestMapping(value="/basic", method = RequestMethod.GET)
    public String sayHello() {
        return "<h1>Hello<h1>   <h2> how are you? <h2>";
    }

    @RequestMapping(value="/proper", method = RequestMethod.GET)
    public String sayProperHello() {
        return "<h1>Hello<h1>   <h2> welcome good sir or madame <h2>";
    }

    @GetMapping("/user")
    public String userForm() {
        return "user form";
    }

    @RequestMapping(value = "/user_greeting", method = RequestMethod.POST)
    @ResponseBody
    public String printUserGreeting(@RequestParam String fname,@RequestParam String lname) {
        return "hello there, " + fname + " " + lname;
    }
    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getOrder(@PathVariable String id) {
        return "Order ID: " + id;
    }
}
