package ua.kozaks.example.service;

import ua.kozaks.example.entity.Account;
import ua.kozaks.example.repository.AccountRepository;

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
