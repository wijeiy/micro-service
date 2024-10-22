package org.example.serviceproduit.Service;

import org.example.serviceproduit.Repositories.ProductRepository;
import org.example.serviceproduit.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(path = "/produit")
    public List<Produit> listProduit(){
        return productRepository.findAll();
    }

    @GetMapping(path = "/produit/{id}")
    public Produit getProduit(@PathVariable Long id){
        return productRepository.findById(id).get();
    }

    @PostMapping
    public Produit createProduct(@RequestBody Produit product) {
        return productRepository.save(product);
    }
}
