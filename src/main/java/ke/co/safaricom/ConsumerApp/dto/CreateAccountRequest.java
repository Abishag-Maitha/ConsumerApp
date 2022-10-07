package ke.co.safaricom.ConsumerApp.dto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

public class CreateAccountRequest {

    @NotBlank
    private String account_name;

    @NotBlank
    private  String account_no;

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }
}
