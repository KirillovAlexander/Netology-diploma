package ru.netology.diploma.repository;

import org.springframework.data.repository.CrudRepository;
import ru.netology.diploma.model.token.TokenBlacklist;

public interface TokenBlacklistRepository extends CrudRepository<TokenBlacklist, String> {
}
