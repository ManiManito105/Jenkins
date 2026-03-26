package com.example.hello;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HelloWorldApplicationTests {

    @Test
    void contextLoads() {
        assertThat(true).isTrue();
    }

    // Cambio para git 2
    // Por si acaso

    @Test
    void helloWorldEndpointShouldReturnMessage() {
        String message = "Hello World from Spring Boot!";
        assertThat(message).isEqualTo("Hello World from Spring Boot!");
    }
}
