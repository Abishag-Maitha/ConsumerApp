package ke.co.safaricom.ConsumerApp.dto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

public class CreateAccountRequest {

    @NotBlank
    private String accountName;

    @NotBlank
    private  String accountNo;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
