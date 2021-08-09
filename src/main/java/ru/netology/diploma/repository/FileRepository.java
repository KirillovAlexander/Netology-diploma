package ru.netology.diploma.repository;

import org.springframework.data.repository.CrudRepository;
import ru.netology.diploma.model.file.File;
import ru.netology.diploma.model.file.Status;

import java.util.List;
import java.util.Optional;

public interface FileRepository extends CrudRepository<File, Long> {
    List<File> findByUsernameAndStatus(String username, Status status);

    Optional<File> findByUsernameAndNameAndStatus(String username, String name, Status status);
}
