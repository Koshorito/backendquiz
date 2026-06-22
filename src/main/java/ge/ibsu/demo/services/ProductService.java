package ge.ibsu.demo.services;

import ge.ibsu.demo.dto.ProductStats;
import ge.ibsu.demo.entities.Product;
import ge.ibsu.demo.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductStats> getStats() {
        return productRepository.getProductStatsByCategory();
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
}