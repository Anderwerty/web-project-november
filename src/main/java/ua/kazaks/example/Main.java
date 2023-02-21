package ua.kazaks.example;

import ua.kazaks.example.repository.AccountRepository;
import ua.kazaks.example.repository.BlaBlaAccountRepository;
import ua.kazaks.example.repository.InMemoryAccountRepository;
import ua.kazaks.example.service.AccountService;

public class Main {

    public static void main(String[] args) {
        AccountRepository accountRepository = new BlaBlaAccountRepository();
        AccountService accountService = new AccountService(accountRepository);
    }
}
