package ke.co.safaricom.ConsumerApp.repositories;

import ke.co.safaricom.ConsumerApp.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountRepository extends JpaRepository <Account, Long> {
    Account findByAccountName(String accountName);
}
