package org.example.serviceproductcomposit.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Recommendation {
    private Long recommendationId;
    private Long productId;
    private String author;
    private String rate;
    private String content;
}
