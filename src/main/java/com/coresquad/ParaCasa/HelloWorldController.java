package com.coresquad.ParaCasa;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {
    public String welcome() {
        return "*** HELLO WORLD! ***";
    }
}