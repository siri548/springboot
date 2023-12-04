  package com.example.nxttrendz1.controller;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.web.bind.annotation.*;
  import java.util.ArrayList; 
  import com.example.nxttrendz1.model.*;
  import com.example.nxttrendz1.service.*;

  @RestController

  public class ReviewController{

    @Autowired
    private ReviewJpaService reviewJpaService;

    @GetMapping("/products/reviews")
    public ArrayList<Review> getReviews(){
        return reviewJpaService.getReviews();
    }
    @GetMapping("/products/reviews/{reviewId}")
    public Review getReviewById(@PathVariable("reviewId") int reviewId){
        return reviewJpaService.getReviewById(reviewId);
    }
    @PutMapping("/products/reviews/{reviewId}")
    public Review updateReview(@PathVariable("reviewId") int reviewId, @RequestBody Review review){
        return reviewJpaService.updateReview(reviewId, review);
    }
    @PostMapping("/products/reviews")
    public Review addReview(@RequestBody Review review){
        return reviewJpaService.addReview(review);
    }
    @DeleteMapping("/products/reviews/{reviewId}")
    public void deleteReview(@PathVariable("reviewId") int reviewId){
        reviewJpaService.deleteReview(reviewId);
    }
    @GetMapping("/reviews/{reviewId}/product")
    public Product getReviewProduct(@PathVariable("reviewId") int reviewId){
        return reviewJpaService.getReviewProduct(reviewId);
    }
  }


// Write your code here