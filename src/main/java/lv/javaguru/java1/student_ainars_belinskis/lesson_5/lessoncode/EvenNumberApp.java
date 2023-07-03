package lv.javaguru.java1.student_ainars_belinskis.lesson_5.lessoncode;

class EvenNumberApp {

    public static void main(String[] args) {
        int number = 4525433;
        boolean isEven = (number % 2) == 0;
        System.out.println("Number is even = " + isEven);

        EvenNumberDetector evenNumber = new EvenNumberDetector();
        System.out.println("Number is even = " + evenNumber.isEven(12));
        System.out.println("Number is even = " + evenNumber.isEven(13));
        System.out.println("Number is even = " + evenNumber.isEven(15));
    }

}
