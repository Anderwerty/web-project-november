package ua.kozaks.example.injector;

import ua.kozaks.example.controller.dispatcher.MethodMap;
import ua.kozaks.example.controller.dispatcher.RegisterForControllers;
import ua.kozaks.example.controller.real.AccountController;
import ua.kozaks.example.controller.real.AuthorizationController;
import ua.kozaks.example.repository.AccountRepository;
import ua.kozaks.example.repository.InMemoryAccountRepository;
import ua.kozaks.example.service.AccountService;

import java.util.Map;

public final class ApplicationContext {

    private ApplicationContext() {
    }

    private static final AccountRepository ACCOUNT_REPOSITORY = new InMemoryAccountRepository();
    private static final AccountService ACCOUNT_SERVICE = new AccountService(ACCOUNT_REPOSITORY);
    private static final AccountController ACCOUNT_CONTROLLER = new AccountController(ACCOUNT_SERVICE);
    private static final AuthorizationController AUTHORIZATION_CONTROLLER = new AuthorizationController();


    public static final Map<String, MethodMap> URL_TO_METHODMAP = new RegisterForControllers().register(ACCOUNT_CONTROLLER,
            AUTHORIZATION_CONTROLLER);

}
