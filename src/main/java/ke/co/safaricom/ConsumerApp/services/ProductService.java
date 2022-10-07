package ke.co.safaricom.ConsumerApp.services;

import ke.co.safaricom.ConsumerApp.dto.CreateProductRequest;
import ke.co.safaricom.ConsumerApp.entities.Product;
import ke.co.safaricom.ConsumerApp.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product create(CreateProductRequest createProductRequest){
        Product product=new Product();
        product.setProduct_name(createProductRequest.getProduct_name());
        productRepository.save(product);
        return product;
    }
}
