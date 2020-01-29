package reactive.http.client.programmatic;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

import javax.inject.Singleton;

@Singleton
public class ConcreteGreetingClient {
    private RxHttpClient httpClient;

    public ConcreteGreetingClient(@Client("/") RxHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Single<String> greetAsync(String name) {
        HttpRequest<String> req = HttpRequest.GET("/async/greet/" + name);
        return httpClient.retrieve(req).first("An error as occurred");
    }
}
