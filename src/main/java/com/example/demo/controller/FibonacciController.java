package com.example.demo.controller;

import com.example.demo.domain.Fibonacci;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    @RequestMapping(path = "/{number}", method = RequestMethod.GET)
    public int getResult(@PathVariable int number) throws Exception {
        return Fibonacci.getResult(number);
    }
}