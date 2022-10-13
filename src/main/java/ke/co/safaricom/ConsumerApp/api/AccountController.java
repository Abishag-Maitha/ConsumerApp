package ke.co.safaricom.ConsumerApp.api;

import ke.co.safaricom.ConsumerApp.dto.AccountUpdateRequest;
import ke.co.safaricom.ConsumerApp.dto.CreateAccountRequest;
import ke.co.safaricom.ConsumerApp.entities.Account;
import ke.co.safaricom.ConsumerApp.services.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public Account creatAccount(@RequestBody @Valid CreateAccountRequest account) {
        return this.accountService.create(account);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable Long id) {
        var account = accountService.getAccountById(id);
        return ResponseEntity.of(account);
    }
    @GetMapping
    public List<Account> getAllAccounts( ) {
        return accountService.getAllById();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody AccountUpdateRequest account){
        var newAccountName=accountService.updateAccount(id,account);
        return ResponseEntity.of(newAccountName);
    }

}






