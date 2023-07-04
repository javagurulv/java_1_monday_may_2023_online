package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day1;

public class NumberToStringTranslator {
    public String checkDivisionByThree(int number) {
        return (number % 3 == 0) ? "Fizz" : "" + number;
    }

    public String checkDivisionByFive(int number) {
        return (number % 5 == 0) ? "Buzz" : "" + number;
    }

    public String checkDivisionByThreeAndFive(int number) {
        return (number % 3 == 0 && number % 5 == 0) ? "FizzBuzz" : "" + number;
    }

    public String translateNumberToString(int number) {
        String result;
        if (number % 3 == 0 && number % 5 == 0) result = "fizzBuzz";
        else if (number % 3 == 0) result = "fizz";
        else if (number % 5 == 0) result = "Buzz";
        else result = "" + number;
return result;
    }
}

