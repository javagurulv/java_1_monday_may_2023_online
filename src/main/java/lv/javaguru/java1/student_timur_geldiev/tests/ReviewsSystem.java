package lv.javaguru.java1.student_timur_geldiev.tests;

import java.util.ArrayList;
import java.util.List;

class ReviewsSystem {

    List<Review> reviewList;

    public ReviewsSystem() {
        this.reviewList = new ArrayList<>();
    }
    public List<Review> getList(){
        return reviewList;
    }

    public void addReview(Review newReview) {
        this.reviewList.add(newReview);
    }

    public void removeReview(Review reviewToRemove) {
        this.reviewList.remove(reviewToRemove);
    }
    public List<Review> findReviewByProduct(String product) {
        List<Review> productsList = new ArrayList<>();
        for (int i = 0; i < this.reviewList.size(); i++) {
            Review review = this.reviewList.get(i);
            if (review.getProduct().equals(product)) {
                productsList.add(review);
            }
        }
        return productsList;
    }
    public int findMaxRate(String product) {
        List<Review> productRate = findReviewByProduct(product);
        return findMaxRate(productRate);
    }

    public int findMaxRate(List<Review> productList) {
        int maxRate = productList.get(0).getRate();
        for (int i = 0; i < productList.size(); i++) {
            Review rate = productList.get(i);
            if (rate.getRate() > maxRate) {
                maxRate = rate.getRate();
            }
        }
        return maxRate;
    }
    public int findMinRate(String product) {
        List<Review> productRate = findReviewByProduct(product);
        return findMinRate(productRate);
    }

    public int findMinRate(List<Review> productList) {
        int minRate = productList.get(0).getRate();
        for (int i = 0; i < productList.size(); i++) {
            Review rate = productList.get(i);
            if (rate.getRate() < minRate) {
                minRate = rate.getRate();
            }
        }
        return minRate;
    }
    public double findAverageRate(String product) {
        List<Review> productRate = findReviewByProduct(product);
        return findAverageRate(productRate);
    }

    public double findAverageRate(List<Review> rates) {
        double sum = 0;
        for (int i = 0; i < rates.size(); i++) {
            Review rate = rates.get(i);
            sum += rate.getRate();
        }
        return sum / rates.size();
    }

}

