package id.ac.ui.cs.advprog.snackventure.auth.service;

import id.ac.ui.cs.advprog.snackventure.auth.models.UserEntity;

public interface UserService {
    public UserEntity findById(String id);
}
