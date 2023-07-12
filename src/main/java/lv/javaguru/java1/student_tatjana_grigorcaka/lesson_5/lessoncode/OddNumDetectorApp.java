package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

class OddNumDetectorApp {

    public static void main(String[] args) {
        int number = 1233;
        boolean isOdd = (number % 2) != 0;
        System.out.println("Number is odd = " + isOdd);

        OddNumDetector oddNumber = new OddNumDetector();
        System.out.println("Number is odd = " + oddNumber.isOdd(3));
        System.out.println("Number is odd = " + oddNumber.isOdd(4));
        System.out.println("Number is odd = " + oddNumber.isOdd(5));
    }
}
