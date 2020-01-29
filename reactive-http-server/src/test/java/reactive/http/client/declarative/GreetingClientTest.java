package reactive.http.client.declarative;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingClientTest {
    private EmbeddedServer server;
    private GreetingClient client;

    @BeforeEach
    void setup() {
        server = ApplicationContext.run(EmbeddedServer.class);
        client = server.getApplicationContext().getBean(GreetingClient.class);
    }

    @AfterEach
    void cleanup() {
        server.stop();
    }

    @Test
    void testGreeting() {
        assertEquals("Hello Mike", client.greet("Mike"));
    }
}