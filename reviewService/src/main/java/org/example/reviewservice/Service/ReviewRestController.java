package org.example.reviewservice.Service;

import org.example.reviewservice.Entites.Review;
import org.example.reviewservice.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewRestController {
    @Autowired
    private ReviewRepository reviewRepository;

    public ReviewRestController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @GetMapping(path = "/review")
    public List<Review> listReview(){
        return reviewRepository.findAll();
    }

    @GetMapping(path = "/review/{id}")
    public Review getCompte(@PathVariable Long id){
        return reviewRepository.findById(id).get();
    }

    @GetMapping("/product/{productId}")
    public List<Review> getReviewsForProduct(@PathVariable Long productId) {
        return reviewRepository.findByProductId(productId);
    }

    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewRepository.save(review);
    }





}
