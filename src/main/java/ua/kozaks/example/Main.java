package ua.kozaks.example;

import ua.kozaks.example.repository.AccountRepository;
import ua.kozaks.example.repository.BlaBlaAccountRepository;
import ua.kozaks.example.service.AccountService;

public class Main {

    public static void main(String[] args) {
        AccountRepository accountRepository = new BlaBlaAccountRepository();
        AccountService accountService = new AccountService(accountRepository);
    }
}
