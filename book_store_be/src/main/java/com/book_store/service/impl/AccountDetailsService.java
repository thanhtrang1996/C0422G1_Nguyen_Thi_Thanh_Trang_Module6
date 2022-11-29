package com.book_store.service.impl;


import com.book_store.model.Account;
import com.book_store.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountDetailsService implements UserDetailsService {
    @Autowired
    private IAccountRepository iAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //check "ten dang nhap" is exits
        Account account = iAccountRepository.findByEmail(username);
        if (account == null) {
            throw new UsernameNotFoundException("Tài khoản: " + username + " không tồn tại");
        }
        return AccountDetails.build(account);

    }
}

