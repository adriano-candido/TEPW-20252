package br.edu.unichristus.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/sum")
    public double sum(@RequestParam(name="n1")  double n1,
                      @RequestParam(name="n2") double n2){
        return n1 + n2;
    }

}
