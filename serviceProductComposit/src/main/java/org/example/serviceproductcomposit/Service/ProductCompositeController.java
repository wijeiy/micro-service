package org.example.serviceproductcomposit.Service;

import org.example.serviceproductcomposit.DTO.ProductComposite;
import org.example.serviceproductcomposit.Model.Produit;
import org.example.serviceproductcomposit.Model.Recommendation;
import org.example.serviceproductcomposit.Model.Review;
import org.example.serviceproductcomposit.Repositories.ProductRestClient;
import org.example.serviceproductcomposit.Repositories.RecommendationRestClient;
import org.example.serviceproductcomposit.Repositories.ReviewRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductCompositeController {

    private ProductRestClient productClient;

    private ReviewRestClient reviewClient;

    private RecommendationRestClient recommendationClient;

    @GetMapping("/{productId}")
    public ProductComposite getProductComposite(@PathVariable Long productId) {
        Produit product = productClient.getProduct(productId);
        List<Review> reviews = reviewClient.getReviews(productId);
        List<Recommendation> recommendations = recommendationClient.getRecommendations(productId);

        return new ProductComposite(product, reviews, recommendations);
    }
}
