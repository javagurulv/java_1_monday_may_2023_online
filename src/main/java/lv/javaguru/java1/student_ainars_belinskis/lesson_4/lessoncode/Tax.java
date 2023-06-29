package lv.javaguru.java1.student_ainars_belinskis.lesson_4.lessoncode;

import java.util.Scanner;

class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter annual income: ");
        double income = scanner.nextDouble();

        double tax10 = (income / 100) * 10;
        double tax15 = 1000 + (((income - 10000)/ 100) * 15);
        double tax20 = 2500 + (((income - 20000)/ 100) * 20);

        if (income < 10000) {
            System.out.println("Tax payable:" + tax10);
        } else if ((income >= 10000) && (income < 20000)) {

            System.out.println("Tax payable:" + tax15);
        } else if (income>= 20000) {
            System.out.println("Tax payable:" + tax20);
        }
    }
}
