package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

public class BiggestOutOfThreeDemo {
    public static void main(String[] args) {
        BiggerNumber check = new BiggerNumber();
        System.out.println("Biggest number is: " + check.findMax(3,4,5));
        System.out.println("Biggest number is: " + check.findMax(0,44,2));
        System.out.println("Biggest number is: " + check.findMax(9,3,2));
        System.out.println("Biggest number is: " + check.findMax(9,9,2));
        System.out.println("Biggest number is: " + check.findMax(3,3,3));
    }
}
