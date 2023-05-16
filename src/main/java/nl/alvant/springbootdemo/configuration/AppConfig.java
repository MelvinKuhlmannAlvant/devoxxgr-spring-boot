package nl.alvant.springbootdemo.configuration;

import nl.alvant.springbootdemo.client.CountriesClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class AppConfig {

    @Bean
    public CountriesClient client(@Value("${countries.url}") String url) {
        var client = WebClient.builder().baseUrl(url).build();
        return HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build().createClient(CountriesClient.class);
    }
}
