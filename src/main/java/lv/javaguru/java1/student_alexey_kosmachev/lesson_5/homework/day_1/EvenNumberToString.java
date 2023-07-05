package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_1;

class EvenNumberToString {
    public String yournumber1 (int number1) {  // метод деления на три
        if (number1 % 3 == 0) { return "Fizz"; }
        else return Integer.toString(number1);
    }

    public String yournumber2 (int number2) {  // метод деления на пять
        if (number2 % 5 == 0) { return "Buzz"; }
        else return Integer.toString(number2);
    }

    public String yournumber3 (int number3) {  // метод деления на три и пять
        if (number3 % 5 == 0 && number3 % 3 == 0) { return "FizzBuzz"; }
        else return Integer.toString(number3);
    }
}

