package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_5;

import java.util.ArrayList;
import java.util.List;

class ProductEvaluationTest {

    public static void main(String[] args) {

        ProductEvaluationTest test = new ProductEvaluationTest();
        test.addReview();
        test.removeReview();
        test.returnAllReviews();
        test.findMaxMark();
        test.findMinMark();
        List<Review> reviews = new ArrayList<>();
        test.findingAverageMark(reviews);

    }



    public void addReview() {
        ProductEvaluation productEvaluation = new ProductEvaluation();
        productEvaluation.addReview("Author1", "Leave a review", 1);
        productEvaluation.addReview("Author2", "Leave a review", 2);
        productEvaluation.addReview("Author3", "Leave a review", 3);
        productEvaluation.addReview("Author4", "Leave a review", 4);
        productEvaluation.addReview("Author5", "Leave a review", 5);
        if (productEvaluation.getReviewsCount() == 5) {
            System.out.println("Add review test = OK");
        } else {
            System.out.println("Add review test = FAIL");
        }
    }

    public void removeReview() {
        ProductEvaluation productEvaluation = new ProductEvaluation();
        productEvaluation.removeReview("Author1", "Leave a review", 1);
        if (productEvaluation.getReviewsCount() == 0) {
            System.out.println("Remove review test = OK");
        } else {
            System.out.println("Remove review test = FAIL");
        }
    }

    public void returnAllReviews() {
        ProductEvaluation productEvaluation = new ProductEvaluation();
        productEvaluation.returnAllReviews("Author1", "Leave a review", 1);
        productEvaluation.returnAllReviews("Author2", "Leave a review", 2);
        productEvaluation.returnAllReviews("Author3", "Leave a review", 3);
        productEvaluation.returnAllReviews("Author4", "Leave a review", 4);
        productEvaluation.returnAllReviews("Author5", "Leave a review", 5);
        if (productEvaluation.getAllReviews() == 5) {
            System.out.println("Return all reviews test = OK");
        } else {
            System.out.println("Return all reviews test = FAIL");
        }
    }

    public void findMaxMark() {
        ProductEvaluation productEvaluation = new ProductEvaluation();
        productEvaluation.addReview("Author1", "Leave a review", 1);
        productEvaluation.addReview("Author2", "Leave a review", 2);
        productEvaluation.addReview("Author3", "Leave a review", 3);
        productEvaluation.addReview("Author4", "Leave a review", 4);
        productEvaluation.addReview("Author5", "Leave a review", 5);
        int realResult = 5;
        int expectedResult = productEvaluation.findMaxMark(5);
        if (realResult == expectedResult) {
            System.out.println("Find max mark test = OK");
        } else {
            System.out.println("Find max mark test = FAIL");
        }
    }

    public void findMinMark() {
        ProductEvaluation productEvaluation = new ProductEvaluation();
        productEvaluation.addReview("Author1", "Leave a review", 1);
        productEvaluation.addReview("Author2", "Leave a review", 2);
        productEvaluation.addReview("Author3", "Leave a review", 3);
        productEvaluation.addReview("Author4", "Leave a review", 4);
        productEvaluation.addReview("Author5", "Leave a review", 5);
        int realResult = 1;
        int expectedResult = productEvaluation.findMinMark(1);
        if (realResult == expectedResult) {
            System.out.println("Find min mark test = OK");
        } else {
            System.out.println("Find min mark test = FAIL");
        }
    }

    public void findingAverageMark(List<Review> reviews) {
        ProductEvaluation productEvaluation = new ProductEvaluation();
        productEvaluation.addReview("Author1", "Leave a review", 1);
        productEvaluation.addReview("Author2", "Leave a review", 2);
        productEvaluation.addReview("Author3", "Leave a review", 3);
        productEvaluation.addReview("Author4", "Leave a review", 4);
        productEvaluation.addReview("Author5", "Leave a review", 5);
        int realResult = 3;
        int expectedResult = productEvaluation.findingAverageMark();
        if (realResult == expectedResult) {
            System.out.println("Finding average mark test = OK");
        } else {
            System.out.println("Finding average mark test = FAIL");
        }

    }




}



