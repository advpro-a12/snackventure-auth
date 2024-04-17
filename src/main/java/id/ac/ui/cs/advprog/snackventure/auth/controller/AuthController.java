package id.ac.ui.cs.advprog.snackventure.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/")
    public String boxItem() {
        return "Hello From Auth";
    }
}
