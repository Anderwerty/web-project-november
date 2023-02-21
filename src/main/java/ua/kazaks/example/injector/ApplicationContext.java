package ua.kazaks.example.injector;

import ua.kazaks.example.controller.dispatcher.RegisterForControllers;
import ua.kazaks.example.controller.real.AccountController;
import ua.kazaks.example.controller.dispatcher.MethodMap;
import ua.kazaks.example.repository.AccountRepository;
import ua.kazaks.example.repository.InMemoryAccountRepository;
import ua.kazaks.example.service.AccountService;

import java.util.Map;

public final class ApplicationContext {

    private ApplicationContext() {
    }

    private static final AccountRepository ACCOUNT_REPOSITORY = new InMemoryAccountRepository();
    private static final AccountService ACCOUNT_SERVICE = new AccountService(ACCOUNT_REPOSITORY);
    private static final AccountController ACCOUNT_CONTROLLER = new AccountController(ACCOUNT_SERVICE);


    public static final Map<String, MethodMap> URL_TO_METHODMAP = new RegisterForControllers().register(ACCOUNT_CONTROLLER);

}
