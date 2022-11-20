package com.book_store.service;


import com.book_store.model.Account;
import org.springframework.security.authentication.AuthenticationProvider;

import java.util.List;
import java.util.Optional;

public interface IAccountService {
//    void saveAccount(Account account);

    Account getAccountByEmail(String email);

    void createAccountForFacebook(String email, AuthenticationProvider authenticationProvider);

    void updateAccountIfExists(Account account, AuthenticationProvider authenticationProvider);
    Account findAccountByEmail(String email);

    List<Account> findAllAccount();

    Account findAccountById(Integer id);

    Account saveAccount(Account account);

    void updateAccount(Account account);
    Optional<Account> findById(Integer idAccount);

    void saveNewPassword(String password, Integer idAccount);
}

