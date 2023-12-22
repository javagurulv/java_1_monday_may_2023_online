package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_5;

import java.util.List;

public class ReviewTest {
    public static void main(String[] args) {
        ReviewTest test = new ReviewTest();
        test.testAddNewReview();
        test.testDeleteReview();
        test.testViewAllReviewOnProduct();
        test.testHighestMark();
        test.testWorstMark();
        test.testAverageMark();
    }

    void testAddNewReview () {
        ReviewList reviewList = new ReviewList();
        List<ReviewObject> testReview = reviewList.addNewReview();
        if(testReview.size() > 0) { System.out.println(": TEST OK!");}
        else {System.out.println(": TEST FAIL!");}
    }

    void testDeleteReview() {
        ReviewList reviewList = new ReviewList();
        List<ReviewObject> testReview = reviewList.addNewReview();
        List<ReviewObject> testReview1 = reviewList.deleteReview();
        if(testReview1.size() == 0) { System.out.println(": TEST OK!");}
        else {System.out.println(": TEST FAIL!");}
    }

    void testViewAllReviewOnProduct() {
        ReviewList reviewList = new ReviewList();
        List<ReviewObject> testReview1 = reviewList.addNewReview();
        List<ReviewObject> testReview2 = reviewList.addNewReview();
        List<ReviewObject> testReview3 = reviewList.addNewReview();
        List<String> viewAllObject = reviewList.viewAllReviewsOnProduct();
        if (viewAllObject.size() == 3) { System.out.println(": TEST OK!");}
        else {System.out.println(": TEST FAIL!");}
    }

    // For Highest Mark Test. I will take three marks for three reviews
    // Marks in reviews 3,2,5
    // Expected highest mark is 5
    void testHighestMark() {
        ReviewList reviewList = new ReviewList();
        List<ReviewObject> testReview1 = reviewList.addNewReview();
        List<ReviewObject> testReview2 = reviewList.addNewReview();
        List<ReviewObject> testReview3 = reviewList.addNewReview();
        int highestMark = reviewList.findHighestMarkForProduct();
        checkResultNumber(highestMark,5,"The highest mark is 5 ");
    }

    // For the worst mark Test. I will take three marks for three reviews
    // Marks in reviews 3,2,5
    // Expected the worst mark is 2

    void testWorstMark() {
        ReviewList reviewList = new ReviewList();
        List<ReviewObject> testReview1 = reviewList.addNewReview();
        List<ReviewObject> testReview2 = reviewList.addNewReview();
        List<ReviewObject> testReview3 = reviewList.addNewReview();
        int worstMark = reviewList.findLowestMarkForProduct();
        checkResultNumber(worstMark,2,"The worst mark is 2 ");
    }

    // For the worst mark Test. I will take three marks for three reviews
    // Marks in reviews 3,2
    // Expected the worst mark is 10/3

    void testAverageMark() {
        ReviewList reviewList = new ReviewList();
        List<ReviewObject> testReview1 = reviewList.addNewReview();
        List<ReviewObject> testReview2 = reviewList.addNewReview();
        double averageMark = reviewList.findAverageMarkForProduct();
        checkResultNumber(averageMark,2.5,"The average mark is 2.5 ");
    }




    private void checkResultString(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

    private void checkResultNumber(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
