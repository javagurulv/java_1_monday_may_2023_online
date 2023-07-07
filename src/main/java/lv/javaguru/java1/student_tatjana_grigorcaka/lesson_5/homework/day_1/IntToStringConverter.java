package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_1;

import java.io.Serializable;

class IntToStringConverter {

    public String convertIntToStringV1(int number1) {
        String result = "FizzBuzz";
        if (number1 % 3 == 0 && number1 % 5 == 0) {
            result = "FizzBuzz";
        }
        return result;
    }

    public String convertIntToStringV2(int number2) {
        String result = "Buzz";
        if ((number2 % 5) == 0) {
            result = "Buzz";
        }
        return result;
    }

    public String convertIntToStringV3(int number3) {
        String result = "Frizz";
        if ((number3 % 3) == 0) {
            result = "Frizz";
        }
        return result;
    }


    public String convertIntToString(int number) {
        String result;
        {
        if ((number % 3 == 0) && (number % 5 == 0))  {
            result = "FizzBuzz";
        }
        else if (number % 5 == 0) {
            result = "Buzz";
        }
        else if (number % 3 == 0) {
                result = "Fizz";
        } else {
            result = String.valueOf(number);
        }
        return result;
        }

    }

}