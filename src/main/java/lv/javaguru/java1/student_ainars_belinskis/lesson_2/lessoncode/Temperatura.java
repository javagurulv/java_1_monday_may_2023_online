package lv.javaguru.java1.student_ainars_belinskis.lesson_2.lessoncode;

import java.util.Scanner;

class Temperatura {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        float celsia = in.nextFloat();

        double farengeit = celsia * 1.8 + 32;
        double kelvin = celsia + 273.15;

        System.out.println("температуру в градусах Цельсия: " + celsia);
        System.out.println("температуру в градусах Фаренгейта: " + farengeit);
        System.out.println("температуру в градусах Кельвина: " + kelvin);

    }

}
