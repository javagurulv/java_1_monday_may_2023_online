package lv.javaguru.java1.student_timur_geldiev.lesson_4.homework.day_6;

import java.util.Scanner;

class SeasonDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int month = sc.nextInt();
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
                break;
        }

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("The month is " + monthName + " and this is winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("The month is " + monthName + " and this is spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("The month is " + monthName + " and this is summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("The month is " + monthName + " and this is autumn");
        } else{
            System.out.println("Enter correct number in range 1-12");

        }
    }
}
