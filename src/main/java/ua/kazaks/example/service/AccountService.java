package ua.kazaks.example.service;

import ua.kazaks.example.entity.Account;
import ua.kazaks.example.repository.AccountRepository;

import java.util.List;

public class AccountService {
    private final AccountRepository inMemoryAccountRepository;

    public AccountService(AccountRepository inMemoryAccountRepository) {
        this.inMemoryAccountRepository = inMemoryAccountRepository;
    }

    public List<Account> findAll() {
        return inMemoryAccountRepository.findAll();
    }
}
