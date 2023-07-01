package lv.javaguru.java1.student_alexey_kosmachev.lesson_2.workinclass;

import java.util.Scanner;
//Формула запроса данных и расчета площади треугольника
class TriangleSqare {
    public static void main(String[]args) {
        //Ищем в гугле код для получения числовых данных от пользователя
        Scanner in = new Scanner(System.in);

        System.out.print("input a: ");
        int aSide = in.nextInt();

        System.out.print("input b: ");
        int bSide = in.nextInt();

        System.out.print("input c: ");
        int cSide = in.nextInt();


        System.out.println("A side = " + aSide);
        System.out.println("B side = " + bSide);
        System.out.println("C side = " + cSide);

        //рассчитываем полупериметр по полученным данным
        double p = (aSide + bSide + cSide) / 2;
        //рассчитываем площадь по формуле ниже
        double square = Math.sqrt(p * (p - aSide) * (p - bSide) * (p - cSide));

        System.out.println("Triangle square = " + square);


    }
}
