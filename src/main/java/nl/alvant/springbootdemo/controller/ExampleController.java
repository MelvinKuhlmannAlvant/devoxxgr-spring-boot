package nl.alvant.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/index")
    public String index() {
        return "Spring boot index endpoint";
    }

    @GetMapping("/test")
    public String test() {
        return "Spring boot index endpoint";
    }
}
