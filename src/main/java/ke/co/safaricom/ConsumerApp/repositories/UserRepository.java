package ke.co.safaricom.ConsumerApp.repositories;

import ke.co.safaricom.ConsumerApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
