package com.example.demo.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TourResponse {
    private Long id;
    private String image;
    private String discountInPercentage;
    private String title;
    private String description;
    private String duration;
    private String actualPrice;
    private String discountedPrice;
}