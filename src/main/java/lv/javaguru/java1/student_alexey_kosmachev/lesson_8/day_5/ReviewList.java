package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_5;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class ReviewList {

    Scanner scanner = new Scanner(System.in);

    List<ReviewObject> reviews = new ArrayList<>();

    public List<ReviewObject> addNewReview () {
        System.out.println("Enter Your Name or Nickname:");
        String nick = scanner.nextLine();
        System.out.println("Enter Product Name:");
        String productName = scanner.nextLine();
        System.out.println("Enter Your Review on Product:");
        String reviewText = scanner.nextLine();
        System.out.println("Enter Your Mark from 1 to 5:");
        int reviewMark = Integer.parseInt(scanner.nextLine());
        ReviewObject newReview = new ReviewObject(nick, productName, reviewText, reviewMark);
        reviews.add(newReview);
        return reviews;
    }

    public List<ReviewObject> deleteReview() {
        System.out.println("Choose review number to delete: ");
        int reviewNumber = Integer.parseInt(scanner.nextLine());
        reviews.remove(reviewNumber);
        return reviews;
    }

    public List<String> viewAllReviewsOnProduct () {
        System.out.println("Enter product Name: ");
        String productName = scanner.nextLine();
        List<String> productReview = new ArrayList<>();
        for (ReviewObject review : reviews) {
            if (review.getProductName().equals(productName)) {
                productReview.add(review.getReviewText());
            }
        }
        return productReview;
    }

    public int findHighestMarkForProduct () {
        System.out.println("Enter product Name: ");
        String productName = scanner.nextLine();
        List<Integer> productReview = new ArrayList<>();
        for (ReviewObject review : reviews) {
            if (review.getProductName().equals(productName)) {
                productReview.add(review.getReviewMark());}
        }
        int maxMark = 0;
        for(int mark: productReview) {
            if (mark > maxMark ) {maxMark = mark;}
        }
        return maxMark;
    }


    public int findLowestMarkForProduct () {
        System.out.println("Enter product Name: ");
        String productName = scanner.nextLine();
        List<Integer> productReview = new ArrayList<>();
        for (ReviewObject review : reviews) {
            if (review.getProductName().equals(productName)) {
                productReview.add(review.getReviewMark());}
                }
        int minMark = 5;
        for(int mark: productReview) {
            if (mark < minMark ) {minMark = mark;}
        }
        return minMark;
    }

    public double findAverageMarkForProduct () {
        System.out.println("Enter product Name: ");
        String productName = scanner.nextLine();
        List<Integer> productReview = new ArrayList<>();
            for (ReviewObject review : reviews) {
                if (review.getProductName().equals(productName)) {
                    productReview.add(review.getReviewMark());}
            }
        double sum = 0;
        for(int mark : productReview) {
            sum += mark ;
        }
        double averageMark = sum / productReview.size();
        return averageMark;
    }
}






