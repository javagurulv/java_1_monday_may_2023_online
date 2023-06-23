package lv.javaguru.java1.student_ainars_belinskis.lesson_2.homework.day_3;

import java.util.Scanner;


// Вопрос 1: при вводе данных радиусаб принимает цифры разделённыке запитой "," (пример 7,5),
// как можно менять локализацию, чтоб работал ввод данных с точкой ".", (пример 7.5)?

class Radius2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a radius: ");
        double radius;
        radius = in.nextDouble();

        double perimeter = (2 * 3.141592 * radius);
        double area = (3.141592 * (radius * radius));

        System.out.printf("Perimeter is = %.14f \n", perimeter);
        System.out.printf("Area is = %.14f \n", area);


    }

}

