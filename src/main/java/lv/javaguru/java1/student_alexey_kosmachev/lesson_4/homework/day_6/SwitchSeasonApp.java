package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.homework.day_6;

import java.util.Scanner;

class SwitchSeasonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of the month: ");
        int monthnumber = scanner.nextInt();

        switch (monthnumber) {
            case 1: System.out.println("it is Winter now");
                break;
            case 2: System.out.println("it is Winter now");
                break;
            case 3: System.out.println("it is Spring now");
                break;
            case 4: System.out.println("it is Spring now");
                break;
            case 5: System.out.println("it is Spring now");
                break;
            case 6: System.out.println("It is Summer now");
                break;
            case 7: System.out.println("It is Summer now");
                break;
            case 8: System.out.println("It is Summer now");
                break;
            case 9: System.out.println("It is Autumn now");
                break;
            case 10: System.out.println("It is Autumn now");
                break;
            case 11: System.out.println("It is Autumn now");
                break;
            case 12: System.out.println("It is Winter now");
                break;
            default: System.out.println("There is no that month");
        }
    }
}
