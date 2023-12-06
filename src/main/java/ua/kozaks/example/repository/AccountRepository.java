package ua.kozaks.example.repository;

import ua.kozaks.example.entity.Account;

import java.util.List;
import java.util.Optional;

//CRUD
// Null Object pattern
public interface AccountRepository {
    List<Account> findAll();

    Optional<Account> findById(Integer id);
}
