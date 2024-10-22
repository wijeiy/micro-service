package org.example.servicerecommendation.Repositories;

import org.example.servicerecommendation.Entities.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface RecomRepository extends JpaRepository<Recommendation,Long> {
    List<Recommendation> findByProductId(Long productId);
}
