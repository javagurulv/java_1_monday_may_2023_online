package lv.javaguru.java1.student_butrin_ilya.lesson_4.homework.day6;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("enter month number:");
        int monthNumber = month.nextInt();

   if (((monthNumber > 0) && (monthNumber < 3)) || monthNumber == 12 )  System.out.println("winter");
   if (monthNumber > 2 && monthNumber < 6) System.out.println("spring");
   if (monthNumber > 5 && monthNumber < 9) System.out.println("summer");
   if (monthNumber > 8 && monthNumber < 12) System.out.println("autumn");
    }

}
