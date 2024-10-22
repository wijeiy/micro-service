package org.example.serviceproduit.Repositories;

import org.example.serviceproduit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Produit ,Long> {
}
