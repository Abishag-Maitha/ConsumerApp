package ke.co.safaricom.ConsumerApp.entities;

import javax.persistence.*;

@Entity
@Table (name = "Account")
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private  String account_name;
    private  String account_no;
    private String account_type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
}
