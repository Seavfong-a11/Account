package org.example.newtesting.Controller;

import lombok.RequiredArgsConstructor;
import org.example.newtesting.Entity.Account;
import org.example.newtesting.Service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;


    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    @GetMapping
    public List<Account> getAll() {
        return accountService.getAll();
    }
}