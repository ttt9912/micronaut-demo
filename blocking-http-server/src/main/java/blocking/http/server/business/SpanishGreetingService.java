package blocking.http.server.business;

import javax.inject.Singleton;

@Singleton
public class SpanishGreetingService implements GreetingService {

    @Override
    public String getGreeting(String name) {
        return "Hola " + name;
    }
}
