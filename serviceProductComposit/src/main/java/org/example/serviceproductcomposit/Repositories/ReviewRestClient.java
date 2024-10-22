package org.example.serviceproductcomposit.Repositories;
import org.example.serviceproductcomposit.Model.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "reviewService", url = "http://localhost:7002")
public interface ReviewRestClient {
    @GetMapping("/reviews/product/{productId}")
    List<Review> getReviews(@PathVariable Long productId);
}
