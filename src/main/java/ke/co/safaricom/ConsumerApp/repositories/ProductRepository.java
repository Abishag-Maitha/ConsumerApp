package ke.co.safaricom.ConsumerApp.repositories;

import ke.co.safaricom.ConsumerApp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProductName(String productName);
}
