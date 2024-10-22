package org.example.serviceproductcomposit.Repositories;

import org.example.serviceproductcomposit.Model.Recommendation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "serviceRecommendation", url = "http://localhost:7003")
public interface RecommendationRestClient {
    @GetMapping("/recommendations/product/{productId}")
    List<Recommendation> getRecommendations(@PathVariable Long productId);
}
