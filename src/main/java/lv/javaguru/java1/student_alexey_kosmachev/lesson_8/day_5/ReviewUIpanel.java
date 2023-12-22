package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_5;


import java.util.Scanner;

class ReviewUIpanel {
    public static void main(String[] args) {
        ReviewList newReviewList = new ReviewList();

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

            if (userChoice == 1) {newReviewList.addNewReview();
            }
            if (userChoice == 2) {newReviewList.deleteReview();
            }
            if (userChoice == 3) {System.out.println("This product review: " + newReviewList.viewAllReviewsOnProduct());
            }
            if (userChoice == 4) {System.out.println("The Best mark is " + newReviewList.findHighestMarkForProduct());
            }

            if (userChoice == 5) {System.out.println("The Worst mark is: " + newReviewList.findLowestMarkForProduct());
            }

            if (userChoice == 6) {System.out.println("The Average mark is: " + newReviewList.findAverageMarkForProduct());
            }

            if (userChoice == 7) {
                System.out.println("Exit program!");
                break;
            }

    }
    }
}