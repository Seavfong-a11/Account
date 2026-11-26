package org.example.newtesting.Service;

import lombok.RequiredArgsConstructor;
import org.example.newtesting.Entity.Account;
import org.example.newtesting.Repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {


        private final AccountRepository accountRepository;


        public Account saveAccount(Account account){
            return accountRepository.save(account);
        }

        public List<Account> getAll(){
            return accountRepository.findAll();
        }


}
