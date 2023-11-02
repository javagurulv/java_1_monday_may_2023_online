package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_4;

public class CirclePerimeterSquareApp {

    public static void main(String[] args) {

        CirclePerimeterSquare newdefinition = new CirclePerimeterSquare();

        System.out.printf("The Perimeter is: " + "%.2f", newdefinition.perimeter(6));
        System.out.printf(" | The Square is: " + "%.2f", newdefinition.square(6));
        System.out.println();
        System.out.printf("The Perimeter is: " + "%.2f", newdefinition.perimeter(35));
        System.out.printf(" | The Square is: " + "%.2f", newdefinition.square(35));
        System.out.println();
        System.out.printf("The Perimeter is: " + "%.2f", newdefinition.perimeter(12));
        System.out.printf(" | The Square is: " + "%.2f", newdefinition.square(12));
        System.out.println();
        System.out.printf("The Perimeter is: " + "%.2f", newdefinition.perimeter(18));
        System.out.printf(" | The Square is: " + "%.2f", newdefinition.square(18));
    }
}
