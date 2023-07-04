package lv.javaguru.java1.student_ainars_belinskis.lesson_5.lessoncode;

class OddNumberApp {

    public static void main(String[] args) {
        int number = 4525433;
        boolean isOdd = (number % 2) != 0;
        System.out.println("Number is odd = " + isOdd);

        OddNumberDetector oddNumber = new OddNumberDetector();
        System.out.println("Number is odd = " + oddNumber.isOdd(12));
        System.out.println("Number is odd = " + oddNumber.isOdd(13));
        System.out.println("Number is odd = " + oddNumber.isOdd(15));
    }

}
