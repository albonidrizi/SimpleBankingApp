package com.banking.BankingApp.controller;

import com.banking.BankingApp.model.Account;
import com.banking.BankingApp.model.DepositModel;
import com.banking.BankingApp.model.TransferModel;
import com.banking.BankingApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/accounts")
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @PostMapping("/accounts")
    public void createAccount(@RequestBody Account account) {
        accountRepository.save(account);
    }

    @PostMapping("/deposit")
    public void deposit(@RequestBody DepositModel depositModel) {
        Integer id = depositModel.getId();
        Integer amount = depositModel.getAmount();

        Account account = accountRepository.getOne(id);
        account.setAmount(account.getAmount() + amount);

        accountRepository.save(account);
    }

    @PostMapping("/withdraw")
    public void withdraw(@RequestBody DepositModel depositModel) {
        Integer id = depositModel.getId();
        Integer amount = depositModel.getAmount();

        Account account = accountRepository.getOne(id);
        account.setAmount(account.getAmount() - amount);

        accountRepository.save(account);
    }

    @PostMapping("/transfer")
    public void transfer(@RequestBody TransferModel transferModel) {
        Integer fromId = transferModel.getFromAccountId();
        Integer toId = transferModel.getToAccountId();
        Integer amount = transferModel.getAmount();

        Account from = accountRepository.getOne(fromId);
        Account to = accountRepository.getOne(toId);

        from.setAmount(from.getAmount() - amount);
        to.setAmount(to.getAmount() + amount);

        accountRepository.save(from);
        accountRepository.save(to);
    }

}
