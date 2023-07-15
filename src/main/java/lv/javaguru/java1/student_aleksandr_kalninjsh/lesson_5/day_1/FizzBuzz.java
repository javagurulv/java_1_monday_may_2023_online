package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_1;

class FizzBuzz {

    public String isDevideByThree(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return "" + number;
        }
    }

    public String isDevideByFive(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }

    }

    public String isDevideBYThreeAndFive(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else {
            return "" + number;
        }
    }

    public String translateNumber(int number) {
        if (number % 15 == 0) {
            return "" + number;
        }
        else {
            return "FizzBuzz";
        }
    }

}



