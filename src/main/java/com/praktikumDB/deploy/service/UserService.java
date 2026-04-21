package com.praktikumDB.deploy.service;

import com.praktikumDB.deploy.model.User;
import com.praktikumDB.deploy.repository.UserRepository;
import jakarta.validation.constraints.Null;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User request){
        request.setId(UUID.randomUUID().toString());
        return userRepository.save(request);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(String id){
        User existingUser = userRepository.findById(id).orElse(null);
        if(existingUser != null){
            existingUser.setName{request.getName());
            existingUser.setNim{request.getNim());
            return userRepository.save(existingUser);
        }
        return null;
    }

    public void deleteUser(String Id)
            userRepository.deleteById();
}
