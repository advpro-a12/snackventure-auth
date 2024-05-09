package id.ac.ui.cs.advprog.snackventure.auth.repository;

import id.ac.ui.cs.advprog.snackventure.auth.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findByUsername(String username);
    Boolean existsByUsername(String username);
}