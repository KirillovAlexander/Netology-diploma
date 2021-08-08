package ru.netology.diploma.service;

import ru.netology.diploma.dto.AuthenticationDTO;

public interface AuthenticationService {
    String getToken(AuthenticationDTO authenticationDTO);

    void removeToken(String token);
}
