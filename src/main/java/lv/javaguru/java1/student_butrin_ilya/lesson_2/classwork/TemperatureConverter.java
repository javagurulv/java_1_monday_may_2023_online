package lv.javaguru.java1.student_butrin_ilya.lesson_2.classwork;

import java.util.Scanner;

public class TemperatureConverter {


    public static void main (String [] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter temperature celsius");
        double cel = in.nextDouble();
        double kalvin = cel + 273.15D;
        double far = (cel * 9 /5) + 32;
        System.out.print(cel + " celsia = ");
        System.out.println(kalvin + "kalvin");
        System.out.println(far + "faringates");





    }

}

