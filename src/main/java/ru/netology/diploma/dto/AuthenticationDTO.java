package ru.netology.diploma.dto;

import lombok.Data;

@Data
public class AuthenticationDTO {
    private String login;
    private String password;
}
