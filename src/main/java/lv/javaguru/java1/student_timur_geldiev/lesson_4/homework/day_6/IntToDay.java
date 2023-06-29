package lv.javaguru.java1.student_timur_geldiev.lesson_4.homework.day_6;

import java.util.Scanner;

class IntToDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number in range 1-7: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("This is Monday using Switch.");
                break;
            case 2:
                System.out.println("This is Tuesday using Switch.");
                break;
            case 3:
                System.out.println("This is Wednesday using Switch.");
                break;
            case 4:
                System.out.println("This is Thursday using Switch.");
                break;
            case 5:
                System.out.println("This is Friday using Switch.");
                break;
            case 6:
                System.out.println("This is Saturday using Switch.");
                break;
            case 7:
                System.out.println("This is Sunday using Switch.");
                break;
            default:
                System.out.println("Enter number in range 1-7");
                break;
        }
        if (day == 1) {
            System.out.println("This is Monday using IF method.");
        } else if (day == 2) {
            System.out.println("This is Tuesday using IF method.");
        } else if (day == 3) {
            System.out.println("This is Wednesday using IF method.");
        } else if (day == 4) {
            System.out.println("This is Thursday using IF method.");
        } else if (day == 5) {
            System.out.println("This is Friday using IF method.");
        } else if (day == 6) {
            System.out.println("This is Saturday using IF method.");
        } else if (day == 7) {
            System.out.println("This is Sunday using IF method.");
        }
    }
}
