package ru.netology.diploma.service;

import ru.netology.diploma.model.user.User;

public interface UserService {
    User findByLogin(String login);

    User findById(Long id);
}
