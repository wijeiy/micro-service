package org.example.serviceproduit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productID;
    private String name;
    private String weight;
}
