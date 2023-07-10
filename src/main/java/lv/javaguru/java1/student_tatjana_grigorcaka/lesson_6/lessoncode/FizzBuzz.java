package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.lessoncode;

class FizzBuzz {

    // 1. num = 9, result = Fizz
    // 2. num = 10, result = Buzz
    // 3. num = 15, result = FizzBuzz
    // 4. num = 11, result = 11


    public static final int NUMBER_5 = 5;
    public static final int NUMBER_3 = 3;

    public String detect(int number) {
        String result;
        if (isDevidedBy15(number)) result = "FizzBuzz";
        else if (isDevidedBy3(number)) result = "Fizz";
        else if (isDevidedBy5(number)) result = "Buzz";
        else result = "" + number;
        return result;
    }

    private boolean isDevidedBy15(int number) {
        return isDevidedBy3(number) && isDevidedBy5(number);
    }

    private boolean isDevidedBy5(int number) {
        return number % NUMBER_5 == 0;
    }

    private boolean isDevidedBy3(int number) {
        return number % NUMBER_3 == 0;
    }

}
