package blocking.http.client.declarative;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

/*
 * see GreetingClientTest
 *
 * Interface is not implemented manually
 *
 * Micronaut understands how to call the
 * service from the method signature and annotations
 */
@Client("/greet")
public interface GreetingClient {

    @Get("/{name}")
    String greet(String name);
}
