package lv.javaguru.java1.student_timur_geldiev.lesson_2.homework.day2;

import java.util.Scanner;

public class HelloUserApp {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name= sc.nextLine();

        System.out.println("Hello " + name + "!");
    }
}
