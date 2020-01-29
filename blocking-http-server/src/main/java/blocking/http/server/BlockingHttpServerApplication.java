package blocking.http.server;

import io.micronaut.runtime.Micronaut;

public class BlockingHttpServerApplication {

    public static void main(String[] args) {
        Micronaut.run(BlockingHttpServerApplication.class);
    }

}