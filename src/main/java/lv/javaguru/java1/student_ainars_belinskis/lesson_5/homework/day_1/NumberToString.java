package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_1;

class NumberToString {
    public String numberDivedThree(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return " " + number;
        }
    }

    public String numberDivedFive(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        } else {
            return " " + number;
        }
    }

    public String numberDivedThreeFive(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return "FizzBuzz";
        } else {
            return " " + number;
        }
    }

}

