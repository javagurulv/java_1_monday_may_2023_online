package lv.javaguru.java1.student_butrin_ilya.lesson_5.Classwork;

public class TakeIntApp {
    public static void main(String[] args) {


        TakeInt number = new TakeInt();
        int numOne = number.takeNumberDefolt();
        int numTwo = number.takeNumber("please enter you HEIGHT");

        System.out.println("first nuber is " + numOne + "\nSecond number is " + numTwo);
    }
}