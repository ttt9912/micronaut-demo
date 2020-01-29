package reactive.http.server.business;

import io.micronaut.context.annotation.Primary;

import javax.inject.Singleton;

@Primary
@Singleton
public class EnglishGreetingService implements GreetingService {

    @Override
    public String getGreeting(String name) {
        return "Hello " + name;
    }
}
