package org.example.serviceproductcomposit.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Produit {
    private String productID;
    private String name;
    private String weight;
}
