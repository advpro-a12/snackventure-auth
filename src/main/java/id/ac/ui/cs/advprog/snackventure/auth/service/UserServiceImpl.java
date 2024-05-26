package id.ac.ui.cs.advprog.snackventure.auth.service;

import id.ac.ui.cs.advprog.snackventure.auth.models.UserEntity;
import id.ac.ui.cs.advprog.snackventure.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity findById(String id) {
        return userRepository.findById(UUID.fromString(id)).orElseThrow(()
                -> new IllegalArgumentException("Invalid user Id:" + id));
    }
}
