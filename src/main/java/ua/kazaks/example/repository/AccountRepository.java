package ua.kazaks.example.repository;

import ua.kazaks.example.entity.Account;

import java.util.List;
import java.util.Optional;

//CRUD
// Null Object pattern
public interface AccountRepository {
    List<Account> findAll();

    Optional<Account> findById(Integer id);
}
