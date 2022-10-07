package ke.co.safaricom.ConsumerApp.api;

import ke.co.safaricom.ConsumerApp.dto.CreateProductRequest;
import ke.co.safaricom.ConsumerApp.entities.Product;
import ke.co.safaricom.ConsumerApp.services.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    }