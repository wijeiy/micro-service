package org.example.reviewservice.Repositories;

import org.example.reviewservice.Entites.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ReviewRepository extends JpaRepository <Review ,Long> {
    List<Review> findByProductId(Long productId);
}
