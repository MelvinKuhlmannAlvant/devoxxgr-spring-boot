package nl.alvant.springbootdemo.controller;

import nl.alvant.springbootdemo.client.CountriesClient;
import nl.alvant.springbootdemo.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountriesController {

    private final CountriesClient client;

    public CountriesController(CountriesClient client) {
        this.client = client;
    }

    @GetMapping
    public Flux<Country> hello(@RequestParam(required = false) List<String> names) {
        return client.getAll();
    }
}
