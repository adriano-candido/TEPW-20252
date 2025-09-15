package br.edu.unichristus.backend.service;

import br.edu.unichristus.backend.domain.model.User;
import br.edu.unichristus.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User save(User user){
        var userSaved = repository.save(user);
        return userSaved;
    }




}
