package blocking.http.client.programmatic;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcreteGreetingClientTest {
    private EmbeddedServer server;
    private ConcreteGreetingClient client;

    @BeforeEach
    void setup() {
        server = ApplicationContext.run(EmbeddedServer.class);
        client = server.getApplicationContext().getBean(ConcreteGreetingClient.class);
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