package lv.javaguru.java1.student_butrin_ilya.lesson_4.homework;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 7");
        int day = days.nextInt();
        boolean isOneToSeven = day > 0 && day <= 7;
        while (isOneToSeven == false){
            System.out.println("Are you stupid? From 1 to 7");
            day = days.nextInt();
            isOneToSeven = day > 0 && day <= 7;
        }
            if (day == 1) System.out.println("monday");
            else if (day == 2) {System.out.println("Tuesday");
            }
            else if (day == 3) {System.out.println("Wednesday");
            }
            else if (day == 4) {System.out.println("Thursday");
            }
            else if (day == 5) {System.out.println("Friday");
            }
            else if (day == 6) {System.out.println("Saturday");
            }
            else if (day == 7) {System.out.println("friday");
             }
        }
    }

