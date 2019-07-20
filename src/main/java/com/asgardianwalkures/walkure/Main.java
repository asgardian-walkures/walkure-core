package com.asgardianwalkures.walkure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @GetMapping("/main")
    public String getMain() {
        return "It Works!";
    }

}
