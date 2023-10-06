package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_5;

import java.util.ArrayList;
import java.util.List;

class ProductEvaluationTest {

    public static void main(String[] args) {

        Review review = new Review("Author", "Leave a review", 1-5);
        List<Review> review = new ArrayList<>();
        review.add(review);

        ProductEvaluationTest productEvaluationTest = new ProductEvaluationTest();
        productEvaluationTest.addReview(review);

    }

    public void addReview(List<Review> review) {
        ProductEvaluation productEvaluation = new ProductEvaluation(review);
        Review review = review.get(0);
        productEvaluation.addReview("Author", "Leave a review", 1-5);
        if (review.size() == 1
            && review.getReviewMark() == 1-5 && (review.getNickName().equals("Author") && (review.getReviewText().equals("Leave a review"))) {
            System.out.println("Add review test = OK");
        } else {
            System.out.println("Add review test = FAIL");

        }

    }



}
