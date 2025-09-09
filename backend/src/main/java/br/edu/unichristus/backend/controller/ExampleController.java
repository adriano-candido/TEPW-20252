package br.edu.unichristus.backend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class ExampleController {

    private List<Pessoa> pessoas = new ArrayList<>();

    @PostMapping
    public Pessoa save(@RequestBody Pessoa pessoa){
        if(pessoas.isEmpty()){
            pessoa.setId(1L);
        }else{
            int ultimaPosicao = pessoas.size() - 1;
            pessoa.setId(pessoas.get(ultimaPosicao).getId() + 1);
        }
        pessoas.add(pessoa);
        return pessoa;
    }

    @GetMapping("/{id}")
    public Pessoa findById(@PathVariable(name = "id") Long id){
        for(Pessoa pessoa : pessoas){
            if(pessoa.getId().equals(id))
                return pessoa;
        }
        return new Pessoa();
    }



}
