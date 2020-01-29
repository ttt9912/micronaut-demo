package reactive.http.client.declarative;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

/*
 * see GreetingClientTest
 *
 * Interface is not implemented manually
 *
 * Micronaut understands how to call the
 * service from the method signature and annotations
 */
@Client("/async/greet")
public interface GreetingClient {

    @Get("/{name}")
    String greet(String name);
}
