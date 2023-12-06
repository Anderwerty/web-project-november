package ua.kozaks.example.repository;

import ua.kozaks.example.entity.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// Impl
// json, yaml, txt, xml
public class InMemoryAccountRepository implements AccountRepository {
    // keyToValue, keyWithValue, keyByValue
    private static final Map<Integer, Account> ID_TO_ACCOUNT = new HashMap<>();

    static {
        ID_TO_ACCOUNT. put(1, new Account(1, "iban-1",100));
        ID_TO_ACCOUNT. put(2, new Account(2, "iban-2",200));
        ID_TO_ACCOUNT. put(3, new Account(3, "iban-3",300));
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(ID_TO_ACCOUNT.values());
    }

    @Override
    public Optional<Account> findById(Integer id) {
        return Optional.ofNullable(ID_TO_ACCOUNT.get(id));
    }
}
