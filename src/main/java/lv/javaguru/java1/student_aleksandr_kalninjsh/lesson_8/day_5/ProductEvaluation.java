package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_5;

import java.util.ArrayList;
import java.util.List;

class ProductEvaluation {
    private List<Review> review;

    public ProductEvaluation(List<Review> review) {
        this.review = review;
    }

    public List<Review> addReview(String nickName, String reviewText,int reviewMark) {
        List<Review> review = new ArrayList<>();
        for (int i = 0; i < this.review.size(); i++) {
            Review review = review.get(i);
            if (review.getReviewMark() == reviewMark && (review.getNickName().equals(nickName) && (review.getReviewText().equals(reviewText)))) {
                review.add(review);
            }
        }

    }



    public void deletingReview(String nickName, String reviewText, int reviewMark) {
        for (int i = 0; i < reviews.size(); i++){
            Review review = reviews.get(i);
            if (review.getReviewMark() == reviewMark && (review.getNickName().equals(nickName) && (review.getReviewText().equals(reviewText)))) {
                reviews.remove(review);
            }
        }
    }

    public int refundOfAllProductReviews() {
        return reviews.size();
    }

    public int findMaxMark(List<Review> reviewMark) {
        int maxMark = reviewMark.get(0).getReviewMark();
        for (int i = 0; i < reviewMark.size(); i++) {
            Review review = reviewMark.get(i);
            if (review.getReviewMark() > maxMark) {
                maxMark = review.getReviewMark();
            }
        }
        return maxMark;
    }

    public int findMinMark(List<Review> reviewMark) {
        int minMark = reviewMark.get(0).getReviewMark();
        for (int i = 0; i < reviewMark.size(); i++) {
            Review review = reviewMark.get(i);
            if (review.getReviewMark() < minMark) {
                minMark = review.getReviewMark();
            }
        }
        return minMark;
    }

    public int findAverageMark(List<Review> reviewMark) {
        if (reviewMark.size() == 0) {
            return 0;
        }
        int maxMark = 0;
        for (int i = 0; i < reviewMark.size(); i++) {
            Review review = reviewMark.get(i);
            maxMark = review.getReviewMark();
        }
        return maxMark / reviewMark.size();
    }
}