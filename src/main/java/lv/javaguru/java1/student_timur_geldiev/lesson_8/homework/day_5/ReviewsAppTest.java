package lv.javaguru.java1.student_timur_geldiev.lesson_8.homework.day_5;

import java.util.List;

public class ReviewsAppTest {
    public static void main(String[] args) {
        ReviewsAppTest test = new ReviewsAppTest();
        test.addNewReviewTest();
        test.findMaxRateTest();
        test.findMinRateTest();
        test.findAverageRateTest();
    }
    public void addNewReviewTest(){
        String expected = "Product";
        ReviewsSystem rev = new ReviewsSystem();
        rev.addReview(new Review("Product", "John", "ReviewText", 5));
        List<Review> actual = rev.findReviewByProduct("Product");
        for (Review review : actual){
            if(review.getProduct().equals(expected)){
                System.out.println("Pass");
            }else {
                System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
            }
        }

    }
    public void findMaxRateTest(){
        int expected = 5;
        ReviewsSystem rev = new ReviewsSystem();
        rev.addReview(new Review("Table", "John", "Good product", 5));
        rev.addReview(new Review("Chair", "John", "Bad product", 1));
        rev.addReview(new Review("Table", "John", "Average product", 3));
        int actual = rev.findMaxRate("Table");
        if(actual == expected){
            System.out.println("Pass");
        }else{
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }
    public void findMinRateTest(){
        int expected = 3;
        ReviewsSystem rev = new ReviewsSystem();
        rev.addReview(new Review("Table", "John", "Good product", 5));
        rev.addReview(new Review("Chair", "John", "Bad product", 1));
        rev.addReview(new Review("Table", "John", "Average product", 3));
        int actual = rev.findMinRate("Table");
        if(actual == expected){
            System.out.println("Pass");
        }else{
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }
    public void findAverageRateTest(){
        double expected = 3.5;
        ReviewsSystem rev = new ReviewsSystem();
        rev.addReview(new Review("Table", "John", "Good product", 4));
        rev.addReview(new Review("Chair", "John", "Bad product", 1));
        rev.addReview(new Review("Table", "John", "Average product", 3));
        double actual = rev.findAverageRate("Table");
        if(actual == expected){
            System.out.println("Pass");
        }else{
            System.out.println("Fail" + " actual result " + actual + " not equal to expected " + expected);
        }
    }


    }