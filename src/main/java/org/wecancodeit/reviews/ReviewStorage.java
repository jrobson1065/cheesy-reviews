package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    @Service
    public class ReviewStorage {

    ReviewRepository reviewRepo;
    public ReviewStorage(ReviewRepository reviewRepo){
    this.reviewRepo = reviewRepo;
    }
    public Review findReviewByCheeseName(String cheeseName) {
        return reviewRepo.findByCheeseName(cheeseName);
    }
    public Iterable<Review> findAllReviews(){
        return reviewRepo.findAll();
    }

        public void save(Review reviewToAddHashTag) {
        reviewRepo.save(reviewToAddHashTag);
        }

        public void deleteReviewById(long reviewId) {
        reviewRepo.deleteById(reviewId);
        }
    }