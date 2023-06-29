package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.homework;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args)
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        number=sc.nextInt();
        if(number==1)
        {
            System.out.print("Monday");
        }
        else if(number==2)
        {
            System.out.print("Tuesday");
        }
        else if(number==3)
        {
            System.out.print("Wednesday");
        }
        else if(number==4)
        {
            System.out.print("Thursday");
        }
        else if(number==5)
        {
            System.out.print("Friday");
        }
        else if(number==6)
        {
            System.out.print("Saturday");
        }
        else if(number==7)
        {
            System.out.print("Sunday");
        }
        else
        {
            System.out.print("Invalid number");
        }
    }
}
