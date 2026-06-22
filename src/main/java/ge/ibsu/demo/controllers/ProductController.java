package ge.ibsu.demo.controllers;

import ge.ibsu.demo.dto.ProductStats;
import ge.ibsu.demo.entities.Product;
import ge.ibsu.demo.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/stats")
    public List<ProductStats> getProductStats() {
        return productService.getStats();
    }
    @PostMapping("/addproducts")
    public Product addProducts(@RequestBody Product product){
        return productService.saveProduct(product);
    }
}