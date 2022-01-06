package com.lightbend.helloworld;

import com.lightbend.lagom.javadsl.client.integration.LagomClientFactory;

import java.net.URI;

public class Main {

    public static void main(String[] args) {
        try (LagomClientFactory clientFactory = LagomClientFactory.create(
                "client",
                LagomClientFactory.class.getClassLoader())
        ) {
            HelloWorldService helloWorldService = clientFactory.createClient(HelloWorldService.class, new URI("http://localhost:9000"));
            String result = helloWorldService.helloWorld().invoke().toCompletableFuture().get();
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
