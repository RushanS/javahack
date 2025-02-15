package ru.raiffeisen.javahack.repository;

import org.springframework.stereotype.Repository;
import ru.raiffeisen.javahack.logic.account.Account;
import ru.raiffeisen.javahack.logic.account.AccountRepository;

@Repository
public class MockAccountRepository implements AccountRepository {

    private Account mockAccount = new MockData().mockAccount();

    @Override
    public Account getByUserName(String username) {
        return mockAccount;
    }

}
