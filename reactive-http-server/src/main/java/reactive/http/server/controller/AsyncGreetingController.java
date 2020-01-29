package reactive.http.server.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import reactive.http.server.business.GreetingService;
import reactor.core.publisher.Mono;

import javax.inject.Inject;

@Controller("/async/greet")
public class AsyncGreetingController {

    @Inject
    private GreetingService greetingService;

    @Get("/{name}")
    public Mono<String> greet(String name) {
        return Mono.just(greetingService.getGreeting(name));
    }

}
