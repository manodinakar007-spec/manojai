package com.mycompany.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class Calculator {

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }
}
