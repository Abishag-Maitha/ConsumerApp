package ke.co.safaricom.ConsumerApp.services;

import ke.co.safaricom.ConsumerApp.dto.CreateProductRequest;
import ke.co.safaricom.ConsumerApp.entities.Product;
import ke.co.safaricom.ConsumerApp.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product create(CreateProductRequest createProductRequest){
        Product product=new Product();
        product.setProductName(createProductRequest.getProductName());
        productRepository.save(product);
        return product;
    }
    public Optional<Product> getProductById(Long productId){
        return productRepository.findById(productId);
    }
    public List<Product> getAllById(){
        return productRepository.findAll();
    }
    public Product getAllByName(String productName){
        return productRepository.findByProductName(productName);
    }
    public void deleteById(Long id){
        productRepository.deleteById(id);
    }
}
