package br.edu.unichristus.backend.service;

import br.edu.unichristus.backend.domain.dto.UserDTO;
import br.edu.unichristus.backend.domain.dto.UserLowDTO;
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

    public UserDTO create(UserDTO dto){
        var user = MapperUtil.parseObject(dto, User.class);
        var userPersist = repository.save(user);

        return MapperUtil.parseObject(userPersist, UserDTO.class);
    }

    public List<UserLowDTO> getAll(){

        return MapperUtil.parseListObjects
                (repository.findAll(), UserLowDTO.class);
    }

    public UserDTO update(UserDTO dto){
        var user = MapperUtil.parseObject(dto, User.class);
        var userPersist = repository.save(user);
        return MapperUtil.parseObject(userPersist, UserDTO.class);
    }

    public void deleteUserById(Long id){
        repository.deleteById(id);
    }

    public UserLowDTO findUserById(Long id){
        return MapperUtil.parseObject(
                repository.findById(id).get(), UserLowDTO.class);
    }





}
