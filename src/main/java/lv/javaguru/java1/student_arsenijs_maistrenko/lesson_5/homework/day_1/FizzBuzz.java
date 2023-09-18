package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_5.homework.day_1;

public class FizzBuzz {
    public String devby3 (int number) {
        if (number % 3 == 0) { return "Fizz"; }
        else return "" + number;
    }
        public String devby5 (int number) {
        if (number % 5 == 0) { return "Buzz"; }
        else return "" + number;
    }
    public String devby3or5 (int number) {
        if (number % 5 == 0 && number % 3 == 0) { return "FizzBuzz"; }
        else return "" + number;
    }
}