package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.workinclass;

public class BiggerNumberApp {
    public static void main(String[] args) {
        BiggerNumber biggerNumber = new BiggerNumber();
        System.out.println("Bigger number: " + biggerNumber.findBiggerNumber(12, 2));
        System.out.println("Bigger number: " + biggerNumber.findBiggerNumberV2(12, 2));
        System.out.println("Bigger number: " + biggerNumber.findBiggerNumberV3(12, 2));

        System.out.println("Bigger number: " + biggerNumber.findMax(12, 2, 777));
    }
}
