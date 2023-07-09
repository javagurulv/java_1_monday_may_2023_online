package lv.javaguru.java1.student_butrin_ilya.lesson_5.Classwork;

import java.util.Scanner;

public class TakeInt {
    Scanner scanner = new Scanner(System.in);
    public int  takeNumberDefolt (){
        System.out.println(" Please, enter the number: ");
        int number = scanner.nextInt();
        return number;
    }
    public int  takeNumber (String x){
        System.out.println(x);
        int number = scanner.nextInt();
        return number;

    }
}
