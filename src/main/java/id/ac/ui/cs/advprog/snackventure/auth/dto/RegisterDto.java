package id.ac.ui.cs.advprog.snackventure.auth.dto;

import lombok.Data;

@Data
public class RegisterDto {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;
}
