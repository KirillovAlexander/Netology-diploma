package ru.netology.diploma.rest;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.netology.diploma.dto.AuthenticationDTO;
import ru.netology.diploma.dto.TokenDTO;
import ru.netology.diploma.service.AuthenticationService;
import org.springframework.http.ResponseEntity;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("login")
    public TokenDTO login(@RequestBody AuthenticationDTO authentication) {
        var token = new TokenDTO();
        token.setValue(authenticationService.getToken(authentication));
        return token;
    }

    @PostMapping("logout")
    public ResponseEntity<?> logout(@RequestHeader("auth-token") String token) {
        authenticationService.removeToken(token);
        return new ResponseEntity(HttpStatus.OK);
    }
}
