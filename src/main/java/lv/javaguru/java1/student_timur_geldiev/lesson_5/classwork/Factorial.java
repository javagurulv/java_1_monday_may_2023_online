package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public BigInteger findFactorial(int number){
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));

        }return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int number = sc.nextInt();
        Factorial fac1 = new Factorial();
        System.out.println("Factorial of integer is " + fac1.findFactorial(number));
    }
}
