package com.example.demo.service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.dto.TourRequest;
import com.example.demo.dto.TourResponse;
import com.example.demo.model.Tour;
import com.example.demo.repository.TourRepository;

@Service
public class TourService {
    private final TourRepository repo;

    public TourService(TourRepository repo) {
        this.repo = repo;
    }

    public TourResponse createTour(TourRequest req) {
        Tour t = Tour.builder()
                .image(req.getImage())
                .discountInPercentage(req.getDiscountInPercentage())
                .title(req.getTitle())
                .description(req.getDescription())
                .duration(req.getDuration())
                .actualPrice(req.getActualPrice())
                .discountedPrice(req.getDiscountedPrice())
                .build();
        Tour saved = repo.save(t);
        return mapToResponse(saved);
    }

    public List<TourResponse> getAllTours() {
        return repo.findAll().stream().map(this::mapToResponse).collect(Collectors.toList());
    }

    public TourResponse getTourById(Long id) {
        Tour t = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tour not found with id: " + id));
        return mapToResponse(t);
    }

    private TourResponse mapToResponse(Tour t) {
        return TourResponse.builder()
                .id(t.getId())
                .image(t.getImage())
                .discountInPercentage(t.getDiscountInPercentage())
                .title(t.getTitle())
                .description(t.getDescription())
                .duration(t.getDuration())
                .actualPrice(t.getActualPrice())
                .discountedPrice(t.getDiscountedPrice())
                .build();
    }
}