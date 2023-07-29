package lv.javaguru.java1.student_timur_geldiev.lesson_8.homework.day_5;

import java.util.List;
import java.util.Scanner;

public class ReviewsSystemApp {
    public static void main(String[] args) {
        ReviewsSystem review = new ReviewsSystem();

        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose an option: " +
                    "\n1.Write a review " +
                    "\n2.Remove review " +
                    "\n3.Find review about product " +
                    "\n4.Find maximal rate for product " +
                    "\n5.Find minimal rate for product" +
                    "\n6.Find average rate for product" +
                    "\n7.Stop the app");
            option = sc.nextInt();
            switch (option) {
                case 1: {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter product name you want to review: ");
                    String product = sc1.nextLine();
                    System.out.println("Enter your nickname: ");
                    String nickname = sc1.nextLine();
                    System.out.println("Write your review: ");
                    String reviewText = sc1.nextLine();
                    System.out.println("Put your mark in range 1-5");
                    int mark = sc1.nextInt();
                    if (mark <= 5 && mark >= 1) {
                        review.addReview(new Review(product, nickname, reviewText, mark));
                    } else {
                        System.out.println("You have to put rate in range 1-5");
                    }
                    break;
                }

                case 2: {

                    List<Review> reviewList = review.getList();
                    for (Review r : reviewList) {
                        System.out.println(r);
                    }
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Choose review text you want to remove from the list: ");
                    String reviewToRemoveText = sc2.nextLine();
                    Review reviewToRemove = null;
                    for (Review r : reviewList) {
                        if (r.getReviewText().equals(reviewToRemoveText)) {
                            reviewToRemove = r;
                        }
                    }
                    if (reviewToRemove != null) {
                        review.removeReview(reviewToRemove);
                    } else {
                        System.out.println("Review not found");
                    }
                    break;
                }
                case 3: {
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Enter product name you want to get reviews about: ");
                    String productName = sc3.nextLine();
                    System.out.println(review.findReviewByProduct(productName));
                    break;
                }
                case 4: {
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Enter product name you want to check highest rate: ");
                    String productName = sc4.nextLine();
                    System.out.println("The highest rate for " + productName + " is " + review.findMaxRate(productName));
                    break;
                }
                case 5: {
                    Scanner sc5 = new Scanner(System.in);
                    System.out.println("Enter product name you want to check lowest rate: ");
                    String productName = sc5.nextLine();
                    System.out.println("The lowest rate for " + productName + " is " + review.findMinRate(productName));
                    break;
                }
                case 6: {
                    Scanner sc6 = new Scanner(System.in);
                    System.out.println("Enter product name you want to find average rate: ");
                    String productName = sc6.nextLine();
                    System.out.println("The average rate for " + productName + " is " + review.findAverageRate(productName));
                    break;
                }

                case 7:
                    System.out.println("Stopping the app");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (option != 7);
    }
}
