package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_2;

import lv.javaguru.java1.student_butrin_ilya.lesson_2.classwork.Second;

import java.util.concurrent.Callable;

public class CarApp {
    public static void main(String[] args) {
        Car FirstCar = new Car("Saab","Black",2000);  //Значения первой машины
        Car SecondCar = new Car("Skoda","White", 1000 ); //Значения второй машины
        Car ThirdCar = new Car("Audi", "Green", 5000.500); //Значения третьей машины

        System.out.println("Decribe your first car: "); //Вывод первой машины
        System.out.println(FirstCar.getType());
        System.out.println(FirstCar.getColour());
        System.out.println(FirstCar.getPrice());

        FirstCar.setType("Honda");  //вносим изменения
        FirstCar.setColour("Purple");
        FirstCar.setPrice(1500);
        System.out.println("Oops we have an another data: "); //Вывод изменений для первой машины
        System.out.println(FirstCar.getType());
        System.out.println(FirstCar.getColour());
        System.out.println(FirstCar.getPrice());

        System.out.println("Decribe your second car: "); //Вывод второй машины
        System.out.println(SecondCar.getType());
        System.out.println(SecondCar.getColour());
        System.out.println(SecondCar.getPrice());

        SecondCar.setType("Toyota");  //вносим изменения
        SecondCar.setColour("Red");
        SecondCar.setPrice(10000);
        System.out.println("Oops we have an another data: "); //Вывод изменений для второй машины
        System.out.println(SecondCar.getType());
        System.out.println(SecondCar.getColour());
        System.out.println(SecondCar.getPrice());

        System.out.println("Decribe your third car: "); //Вывод третьей машины
        System.out.println(ThirdCar.getType());
        System.out.println(ThirdCar.getColour());
        System.out.println(ThirdCar.getPrice());

        ThirdCar.setType("Citroen");  //вносим изменения
        ThirdCar.setColour("Blue");
        ThirdCar.setPrice(4000.200);
        System.out.println("Oops we have an another data: "); //Вывод изменений для третьей машины
        System.out.println(ThirdCar.getType());
        System.out.println(ThirdCar.getColour());
        System.out.println(ThirdCar.getPrice());






    }


}
