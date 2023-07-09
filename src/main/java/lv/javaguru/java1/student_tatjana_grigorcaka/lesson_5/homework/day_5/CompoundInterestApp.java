package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_5;


import java.util.Scanner;

public class CompoundInterestApp {
    public static void main(String[] args) {
        CompoundInterest compoundInterest1 = new CompoundInterest();
        System.out.println("Total amount is: " + compoundInterest1.calculateCompoundInterest(1200, 5.4, 2));
        System.out.println("Total amount is: " + compoundInterest1.calculateCompoundInterest(100000, 5, 3));
       }
}
