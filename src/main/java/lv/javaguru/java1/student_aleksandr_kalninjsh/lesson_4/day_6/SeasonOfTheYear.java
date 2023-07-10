package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_4.day_6;

import java.util.Scanner;

public class SeasonOfTheYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12: ");
        int seasonOfTheYear = scanner.nextInt();

        int december = 12;
        int januaru = 1;
        int february = 2;
        int march = 3;
        int april = 4;
        int may = 5;
        int june = 6;
        int july = 7;
        int august = 8;
        int september = 9;
        int october = 10;
        int november = 11;



        switch (seasonOfTheYear) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");

        }
    }
}
