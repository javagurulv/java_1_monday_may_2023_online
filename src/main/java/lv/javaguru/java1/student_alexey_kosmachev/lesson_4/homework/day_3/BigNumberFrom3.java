package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.homework.day_3;

import java.util.Scanner;

//  один больше двух, один больше трех, два больше одного, два больше трех, три больше одного, три больше двух,
// один равно два равно три
// два равно три и больше одного, два равно один и больше трех, три равен один и больше два
class BigNumberFrom3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstnumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondnumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdnumber = scanner.nextInt();

        if ((firstnumber > secondnumber) && (firstnumber > thirdnumber )) {System.out.println("The biggest number is " + firstnumber);}
        if ((secondnumber > firstnumber) && (secondnumber > thirdnumber )) {System.out.println("The biggest number is " + secondnumber);}
        if ((thirdnumber > firstnumber) && (thirdnumber > secondnumber )) {System.out.println("The biggest number is " + thirdnumber);}
        if ((secondnumber == firstnumber) && (secondnumber == thirdnumber)) {System.out.println("Numbers are equals");}
        if ((secondnumber == thirdnumber) && (secondnumber > firstnumber )) {System.out.println("The biggest number is " + secondnumber);}
        if ((secondnumber == firstnumber) && (secondnumber > thirdnumber)) {System.out.println("The biggest number is " + secondnumber);}
        if ((thirdnumber == firstnumber) && (thirdnumber > secondnumber)) {System.out.println("The biggest number is " + thirdnumber);}

    }
}
