package nl.alvant.springbootdemo.client;

import nl.alvant.springbootdemo.model.Country;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Flux;

@HttpExchange("v3.1")
public interface CountriesClient {

    @GetExchange("all")
    Flux<Country> getAll();
}
