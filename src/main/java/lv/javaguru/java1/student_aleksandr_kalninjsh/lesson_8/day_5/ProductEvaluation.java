package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_5;

import java.util.ArrayList;
import java.util.List;

class ProductEvaluation {

    private List<Review> reviews;

    public ProductEvaluation() {
        reviews = new ArrayList<>();
    }

    public void addReview(String nickName,
                          String reviewText,
                          int reviewMark) {
        Review newReview = new Review(nickName, reviewText, reviewMark);
        reviews.add(newReview);
    }

    public void removeReview(String nickName,
                             String reviewText,
                             int reviewMark) {
        Review newReview = new Review(nickName, reviewText, reviewMark);
        reviews.remove(newReview);
    }

    public void returnAllReviews(String nickName,
                                 String reviewText,
                                 int reviewMark) {
        Review allReview = new Review(nickName, reviewText, reviewMark);
        reviews.add(allReview);
    }

    public int getAllReviews() {
        return reviews.size();
    }



    public int getReviewsCount() {
        return reviews.size();
    }



    public int findMaxMark(int reviewMark) {
        int maxMark = 0;
        for (int i = 0; i < reviews.size(); i++) {
            Review review = reviews.get(i);
            if (review.getReviewMark() > maxMark) {
                maxMark = review.getReviewMark();
            }
        }
        return maxMark;
    }

    public int findMinMark(int reviewMark) {
        int minMark = 1;
        for (int i = 0; i < reviews.size(); i++) {
            Review review = reviews.get(i);
            if (review.getReviewMark() < minMark) {
                minMark = review.getReviewMark();
            }
        }
        return minMark;
    }

    public int findingAverageMark() {
        int sum = 0;
        for (int i = 0; i < reviews.size(); i++) {
            Review review = reviews.get(i);
            sum = sum + review.getReviewMark();
        }
        return sum / reviews.size();
    }


}

