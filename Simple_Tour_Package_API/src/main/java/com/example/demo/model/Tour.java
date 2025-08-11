package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tours")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String discountInPercentage;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "text", nullable = false)
    private String description;

    @Column(nullable = false)
    private String duration;

    @Column(nullable = false)
    private String actualPrice;

    @Column(nullable = false)
    private String discountedPrice;
}