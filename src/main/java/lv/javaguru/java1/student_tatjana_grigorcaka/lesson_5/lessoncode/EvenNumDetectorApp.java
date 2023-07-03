package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

class EvenNumDetectorApp {

    public static void main(String[] args) {
        int number = 1233;
        boolean isEven = (number % 2) == 0;
        System.out.println("Number is even = " + isEven);

        EvenNumDetector evenNumber = new EvenNumDetector();
        System.out.println("Number is even = " + evenNumber.isEven(3));
        System.out.println("Number is even = " + evenNumber.isEven(4));
        System.out.println("Number is even = " + evenNumber.isEven(5));
    }
}
