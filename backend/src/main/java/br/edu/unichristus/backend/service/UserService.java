package br.edu.unichristus.backend.service;

import br.edu.unichristus.backend.domain.dto.UserDTO;
import br.edu.unichristus.backend.domain.model.User;
import br.edu.unichristus.backend.repository.UserRepository;
import br.edu.unichristus.backend.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User create(User user){
        var userSaved = repository.save(user);
        return userSaved;
    }

    public List<User> getAll(){
        return repository.findAll();
    }

    public User update(User user){
        var userSaved = repository.save(user);
        return userSaved;
    }

    public void deleteUserById(Long id){
        repository.deleteById(id);
    }

    public User findUserById(Long id){
        return repository.findById(id).get();
    }





}
