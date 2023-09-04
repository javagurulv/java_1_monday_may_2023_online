package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_5;


import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ReviewUIpanel {
    public static void main(String[] args) {
        List<ReviewObject> reviews = new ArrayList<>();

        while (true) {
            System.out.println("Program menu: ");
            System.out.println("1. Create Review on Product ");
            System.out.println("2. Delete Review on Product ");
            System.out.println("3. View all reviews for a product ");
            System.out.println("4. The Best mark in review on product ");
            System.out.println("5. The Worst mark in review on product ");
            System.out.println("6. View the Average mark on product ");
            System.out.println("7. Exit ");

            Scanner scanner = new Scanner(System.in);
            int userChoice = Integer.parseInt(scanner.nextLine());

            if (userChoice == 1) {
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
            }
            if (userChoice == 2) {
                System.out.println("Choose review number to delete: ");
                int reviewNumber = Integer.parseInt(scanner.nextLine());
                reviews.remove(reviewNumber);
            }
            if (userChoice == 3) {
                System.out.println("Enter product Name: ");
                String productName = scanner.nextLine();
                for (ReviewObject review : reviews) {
                    if (review.getProductName().equals(productName)) {
                        System.out.println("All reviews on the product: " + review.getReviewText());
                    }
                }
            }


            if (userChoice == 4) {
                System.out.println("Enter product Name: ");
                String productName = scanner.nextLine();
                List<Integer> productReview = new ArrayList<>();
                for (ReviewObject review : reviews) {
                    if (review.getProductName().equals(productName)) {
                        productReview.add(review.getReviewMark());
                        Collections.sort(productReview);
                            }
                    System.out.print("The highest mark for " + productName + " is: " + productReview.get(productReview.size() - 1));
                        }

                    }

            if (userChoice == 5) {
                System.out.println("Enter product Name: ");
                String productName = scanner.nextLine();
                List<Integer> productReview = new ArrayList<>();
                for (ReviewObject review : reviews) {
                    if (review.getProductName().equals(productName)) {
                        productReview.add(review.getReviewMark());
                        Collections.sort(productReview);
                            }
                    System.out.print("The worst mark for " + productName + " is: " + productReview.get(0));
                        }
                    }


            if (userChoice == 6) {
                System.out.println("Enter product Name: ");
                String productName = scanner.nextLine();
                List<ReviewObject> productReview = new ArrayList<>();
                for (ReviewObject review : reviews) {
                    if (review.getProductName().equals(productName)) {
                        productReview.add(review);
                        int sum = 0;
                        for (int d = 0; d < productReview.size(); d++) {
                            ReviewObject mark = productReview.get(d);
                            sum = sum + mark.getReviewMark();
                            System.out.println("The Average mark for " + productName + " is: " + sum / productReview.size());
                        }

                    }
                }
            }
            if (userChoice == 7) {
                System.out.println("Exit program!");
                break;
            }

    }
    }
}