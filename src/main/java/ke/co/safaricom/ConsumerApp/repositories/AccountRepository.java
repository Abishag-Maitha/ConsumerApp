package ke.co.safaricom.ConsumerApp.repositories;

import ke.co.safaricom.ConsumerApp.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository <Account, Long> {
    List<Account> findByTitle(String title);
}
