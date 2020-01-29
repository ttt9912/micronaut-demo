package blocking.http.client.programmatic;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;

import javax.inject.Singleton;

@Singleton
public class ConcreteGreetingClient {
    private RxHttpClient httpClient;

    public ConcreteGreetingClient(@Client("/") RxHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public String greet(String name) {
        HttpRequest<String> req = HttpRequest.GET("/greet/" + name);
        return httpClient.retrieve(req).blockingFirst();
    }
}
