package ke.co.safaricom.ConsumerApp.services;

import ke.co.safaricom.ConsumerApp.api.AccountController;
import ke.co.safaricom.ConsumerApp.dto.AccountUpdateRequest;
import ke.co.safaricom.ConsumerApp.dto.CreateAccountRequest;
import ke.co.safaricom.ConsumerApp.entities.Account;
import ke.co.safaricom.ConsumerApp.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
public Account create(CreateAccountRequest createAccountRequest){
        Account account=new Account();
        account.setAccountName(createAccountRequest.getAccountName());
        account.setAccountNo(createAccountRequest.getAccountNo());
        accountRepository.save(account);

    return account;
}
public Optional <Account> updateAccount(Long accountId, AccountUpdateRequest accountUpdateRequest){
        var accountTOUpdate= this.accountRepository.findById(accountId);
        accountTOUpdate.ifPresent(a->{
            a.setAccountName(accountUpdateRequest.getAccountName());
            a.setAccountType(accountUpdateRequest.getAccountType());
        });
        return accountTOUpdate;
}

public Optional <Account> getAccountById(Long accountId){
        return  accountRepository.findById( accountId);
}
public List<Account> getAllById(){
        return accountRepository.findAll();
}
public  Account getAllByName(String title){
        return accountRepository.findByAccountName(title);
}
public void deleteById(Long Id){
        accountRepository.deleteById(Id);
}

}
