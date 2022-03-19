package com.coresquad.ParaCasa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController // indica la clase como controller y responseBody
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/welcome") // mapea la ruta /welcome con el metodo helloWorld
    public HelloWorld helloWorld(
            @RequestParam(value = "name", defaultValue = "World!") // bindea los parametros de la ruta y los asigna a value
                    String name) {
        return new HelloWorld(counter.incrementAndGet(),
                String.format(template, name));
    }
}