package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

class BiggerNumberApp {
    public static void main(String[] args) {
        BiggerNumber numb = new BiggerNumber();
        System.out.println("Bigger number is: " + numb.findBigger(5,7));
        System.out.println("Bigger number is: " + numb.findBigger(-43,2));
        System.out.println("Bigger number is: " + numb.findBigger(8888, 8887));
        System.out.println("Bigger number is: " + numb.findBigger(1,0));
        System.out.println("Bigger number is: " + numb.findBigger(7,7));
    }
}
