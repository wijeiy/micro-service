package org.example.servicerecommendation.Service;

import org.example.servicerecommendation.Entities.Recommendation;
import org.example.servicerecommendation.Repositories.RecomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecomRestController {
    @Autowired
    private RecomRepository recomRepository;

    public RecomRestController(RecomRepository recomRepository) {
        this.recomRepository = recomRepository;
    }

    @GetMapping(path = "/recommendation")
    public List<Recommendation> listRecommendation() {
        return recomRepository.findAll();
    }

    @GetMapping(path = "/recommendation/{id}")
    public Recommendation getRecommendation(@PathVariable Long id){
        return recomRepository.findById(id).get();
    }

    @GetMapping("/recommendation/product/{productId}")
    public List<Recommendation> getRecommendationsForProduct(@PathVariable Long productId) {
        return recomRepository.findByProductId(productId);
    }

    @PostMapping
    public Recommendation createRecommendation(@RequestBody Recommendation recommendation) {
        return recomRepository.save(recommendation);
    }
}
