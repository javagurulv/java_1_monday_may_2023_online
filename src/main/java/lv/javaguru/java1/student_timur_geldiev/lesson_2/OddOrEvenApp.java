package lv.javaguru.java1.student_timur_geldiev.lesson_2;

import java.util.Scanner;

public class OddOrEvenApp {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number= sc.nextInt();
        if (number % 2 == 0){
            System.out.println("Your number is even");
        }else {
            System.out.println("Your number is odd");
        }
    }
}
