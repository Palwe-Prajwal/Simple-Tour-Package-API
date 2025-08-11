package com.example.demo.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TourRequest;
import com.example.demo.dto.TourResponse;
import com.example.demo.service.TourService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tours")
public class TourController {
    private final TourService service;

    public TourController(TourService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TourResponse> createTour(@Valid @RequestBody TourRequest req) {
        TourResponse created = service.createTour(req);
        // return 201 with Location header
        return ResponseEntity.created(URI.create("/api/tours/" + created.getId())).body(created);
    }

    @GetMapping
    public ResponseEntity<List<TourResponse>> getAllTours() {
        return ResponseEntity.ok(service.getAllTours());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TourResponse> getTourById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getTourById(id));
    }
}