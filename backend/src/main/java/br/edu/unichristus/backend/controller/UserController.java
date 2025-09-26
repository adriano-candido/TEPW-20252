package br.edu.unichristus.backend.controller;

import br.edu.unichristus.backend.domain.model.User;
import br.edu.unichristus.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User create(@RequestBody User user){
        return service.create(user);
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return service.getAll();
    }

    @PutMapping
    public User update(@RequestBody User user){
        return service.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        service.deleteUserById(id);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable(name = "id") Long id){
       return service.findUserById(id);
    }

}
