package ke.co.safaricom.ConsumerApp.api;

import ke.co.safaricom.ConsumerApp.dto.CreateProductRequest;
import ke.co.safaricom.ConsumerApp.dto.ProductUpdateRequest;
import ke.co.safaricom.ConsumerApp.entities.Product;
import ke.co.safaricom.ConsumerApp.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping
    public Product creatProduct(@RequestBody CreateProductRequest product){
        return this.productService.create(product);}
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        var product=productService.getProductById(id);
        return ResponseEntity.of(product);
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllById();
    }
   @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody ProductUpdateRequest product){
        var newProductName=productService.updateProduct(id, product);
        return ResponseEntity.of(newProductName);
   }

    }