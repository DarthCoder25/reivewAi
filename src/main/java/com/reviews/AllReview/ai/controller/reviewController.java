package com.reviews.AllReview.ai.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/v1")
public class reviewController {

    @GetMapping("/getReview")
    public String getReview(){
        return "Hi Here is your first review";

    }

    @PostMapping("/saveReview")
    public ResponseEntity<String> saveReview()
    {
        return ResponseEntity.ok("We saved your review");
    }

}
