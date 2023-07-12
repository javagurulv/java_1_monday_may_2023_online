package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_1;

class IntToStringFizzBuzz {

    public String convertIntToStringV1(int number) {
        String result = "FizzBuzz";
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        }
        return result;
    }

    public String convertIntToStringV2(int number) {
        String result = "Buzz";
        if ((number % 5) == 0) {
            result = "Buzz";
        }
        return result;
    }

    public String convertIntToStringV3(int number) {
        String result = "Frizz";
        if ((number % 3) == 0) {
            result = "Frizz";
        }
        return result;
    }


    public String convertIntToString(int number) {
        String result;
        {
        if (isDividedBy15(number))  {
            result = "FizzBuzz";
        } else if (isDividedBy5(number)) {
            result = "Buzz";
        } else if (isDividedBy3(number)) {
                result = "Fizz";
        } else {
            result = String.valueOf(number);
        }
        return result;
        }

    }

    private boolean isDividedBy15(int number) {
        return isDividedBy3(number) && isDividedBy5(number);
    }

    private boolean isDividedBy5(int number) {
        return number % 5 == 0;
    }

    private boolean isDividedBy3(int number) {
        return number % 3 == 0;
    }

}