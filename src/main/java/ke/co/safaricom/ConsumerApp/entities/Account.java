package ke.co.safaricom.ConsumerApp.entities;

import javax.persistence.*;

@Entity
@Table (name = "Account")
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private  String accountName;
    private  String accountNo;
    private String accountType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
