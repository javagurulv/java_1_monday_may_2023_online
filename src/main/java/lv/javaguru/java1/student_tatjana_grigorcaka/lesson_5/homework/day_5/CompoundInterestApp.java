package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_5;


import java.util.Scanner;

public class CompoundInterestApp {
    public static void main(String[] args) {
        CompoundInterest compoundInterest1 = new CompoundInterest();
        System.out.println("Total amount is: " + compoundInterest1.calculateCompoundInterest(10000, 8, 10, 4));
        System.out.println("Total amount is: " + compoundInterest1.calculateCompoundInterest(15000, 8, 10, 12));
       }
}
