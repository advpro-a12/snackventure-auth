package id.ac.ui.cs.advprog.snackventure.auth.repository;

import id.ac.ui.cs.advprog.snackventure.auth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}