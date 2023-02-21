package ua.kazaks.example.entity;

import java.util.Objects;

public class Account {
    private final Integer id;
    private final String iban;
    private final int amount;

    public Account(Integer id, String iban, int amount) {
        this.id = id;
        this.iban = iban;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return amount == account.amount &&
                Objects.equals(id, account.id) &&
                Objects.equals(iban, account.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, id, iban);
    }
}
