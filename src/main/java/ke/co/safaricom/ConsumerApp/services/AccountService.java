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
        account.setAccount_name(createAccountRequest.getAccount_name());
        account.setAccount_no(createAccountRequest.getAccount_no());
        accountRepository.save(account);

    return account;
}
public Optional <Account> updateAccount(Long accountId, AccountUpdateRequest accountUpdateRequest){
        var accountTOUpdate= this.accountRepository.findById(accountId);
        accountTOUpdate.ifPresent(a->{
            a.setAccount_name(accountUpdateRequest.getAccount_name());
            a.setAccount_type(accountUpdateRequest.getAccount_type());
        });
        return accountTOUpdate;
}

public Optional <Account> getAccountById(Long accountId){
        return  accountRepository.findById( accountId);
}
public List<Account> getAllById(){
        return accountRepository.findAll();
}
public  List<Account> getAllByTitle(String title){
        return accountRepository.findByTitle(title);
}
public void deleteById(Long Id){
        accountRepository.deleteById(Id);
}

}
