package id.ac.ui.cs.advprog.snackventure.auth.service;

import id.ac.ui.cs.advprog.snackventure.auth.enums.UserRole;
import id.ac.ui.cs.advprog.snackventure.auth.models.UserEntity;
import id.ac.ui.cs.advprog.snackventure.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

@Service
public class CustomUserDetailsService  implements UserDetailsService {

    private static UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        return new User(user.getUsername(), user.getPassword(), mapRolesToAuthorities(user.getUserRole()));
    }

    private Collection<GrantedAuthority> mapRolesToAuthorities(UserRole userRole) {
        return Collections.singletonList(new SimpleGrantedAuthority(userRole.name()));
    }

    public static UUID getId(String username) {
        UserEntity user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        return user.getId();
    }
}