package ua.kazaks.example.repository;

import ua.kazaks.example.entity.Account;

import java.util.List;
import java.util.Optional;

public class BlaBlaAccountRepository implements AccountRepository{
    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Optional<Account> findById(Integer id) {
        return Optional.empty();
    }
}
