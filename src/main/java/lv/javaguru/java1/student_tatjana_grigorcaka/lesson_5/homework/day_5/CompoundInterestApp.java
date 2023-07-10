package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_5;

import java.util.Scanner;

class CompoundInterestApp {
    public static void main(String[] args) {
        CompoundInterest compoundInterest1 = new CompoundInterest();
        System.out.println("The total amount is: " + compoundInterest1.calculateCompoundInterest(2000,5,3));
        System.out.println("The total amount is: " + compoundInterest1.calculateCompoundInterest(5000,5,5));
    }
}

