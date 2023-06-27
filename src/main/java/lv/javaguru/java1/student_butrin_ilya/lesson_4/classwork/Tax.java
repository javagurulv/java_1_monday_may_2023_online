package lv.javaguru.java1.student_butrin_ilya.lesson_4.classwork;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you salary: ");
        int salary = scanner.nextInt();
        if (salary <= 10000) {
            double tax10k = salary * 0.1;
            System.out.println("Tax = " + tax10k);
        }
        else if (salary > 10000 && salary <20000) {
            double remains = salary - 10000;
            double tax10k = 10000 * 0.1;
            double tax20k = remains * 0.15 + tax10k;
            System.out.println("Tax = " + tax20k);
        }
        else {
            double remains = salary - 20000;
            double tax10k = 10000 * 0.1;
            double tax20k =  10000 * 0.15 ;
            double tax20Plus = remains * 0.2 + tax10k + tax20k;
            System.out.println("Tax = " + tax20Plus);

        }
    }
}