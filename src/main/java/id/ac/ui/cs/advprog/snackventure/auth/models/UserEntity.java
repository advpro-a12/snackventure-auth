package id.ac.ui.cs.advprog.snackventure.auth.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

import id.ac.ui.cs.advprog.snackventure.auth.enums.UserRole;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String username;

    private String password;

    private String email;

    private String phoneNumber;

    private String address;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;
}
