package de.lineas.bddemo;

import groovy.lang.Grab;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Grab("org.webjars:jquery:2.0.3-1")
@Controller
public class CoffeeController {

    @GetMapping("/coffee")
    public String init() {
        return "coffee";
    }

}
