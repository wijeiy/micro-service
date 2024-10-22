package org.example.serviceproductcomposit.Repositories;

import org.example.serviceproductcomposit.Model.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "serviceProduit", url = "http://localhost:7001")
public interface ProductRestClient {
    @GetMapping("/products/{id}")
    Produit getProduct(@PathVariable Long id);
}
