package lv.javaguru.java1.student_timur_geldiev.lesson_4.homework.day_6;

import java.util.Scanner;

class ArabicToRome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int arabic = sc.nextInt();

        switch (arabic){
            case 0:
                System.out.println("There is no 0 in Roman numerals.");
                break;
            case 1:
                System.out.println("Arabic " + arabic + " - is Roman I");
                break;
            case 2:
                System.out.println("Arabic " + arabic + " - is Roman II");
                break;
            case 3:
                System.out.println("Arabic " + arabic + " - is Roman III");
                break;
            case 4:
                System.out.println("Arabic " + arabic + " - is Roman IV");
                break;
            case 5:
                System.out.println("Arabic " + arabic + " - is Roman V");
                break;
            case 6:
                System.out.println("Arabic " + arabic + " - is Roman VI");
                break;
            case 7:
                System.out.println("Arabic " + arabic + " - is Roman VII");
                break;
            case 8:
                System.out.println("Arabic " + arabic + " - is Roman VIII");
                break;
            case 9:
                System.out.println("Arabic " + arabic + " - is Roman IX");
                break;
            case 10:
                System.out.println("Arabic " + arabic + " - is Roman X");
                break;
            default:
                System.out.println("Enter number in range 1-10");
                break;
        }
    }
}
