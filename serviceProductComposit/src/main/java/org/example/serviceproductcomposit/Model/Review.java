package org.example.serviceproductcomposit.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Review {
    private Long reviewID;
    private Long productID;
    private String author;
    private String subject;
    private String content;
}
