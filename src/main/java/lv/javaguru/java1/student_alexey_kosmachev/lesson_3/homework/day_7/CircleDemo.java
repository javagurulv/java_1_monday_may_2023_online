package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_7;

class CircleDemo {
    public static void main(String[] args) {

        Circle circle1 = new Circle(6.5);
        Circle circle2 = new Circle(2.3);

        System.out.printf("Circle Area first is: " + "%.2f", circle1.calculateArea());
        System.out.printf(" Circle Area second is: " + "%.2f", circle2.calculateArea());

    }
}
