package org.example.serviceproductcomposit.DTO;

import org.example.serviceproductcomposit.Model.Produit;
import org.example.serviceproductcomposit.Model.Recommendation;
import org.example.serviceproductcomposit.Model.Review;

import java.util.List;

public class ProductComposite {
    private Produit product;
    private List<Review> reviews;
    private List<Recommendation> recommendations;

    public ProductComposite(Produit product, List<Review> reviews, List<Recommendation> recommendations) {
        this.product = product;
        this.reviews = reviews;
        this.recommendations = recommendations;
    }
}
