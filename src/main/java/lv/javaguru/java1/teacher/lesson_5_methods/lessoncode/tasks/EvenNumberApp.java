package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode.tasks;

class EvenNumberApp {

    public static void main(String[] args) {
        int number = 4525433;
        boolean isEven = (number % 2) == 0;
        System.out.println("Number is even = " + isEven);

        EvenNumber evenNumber = new EvenNumber();
        System.out.println("Number is even = " + evenNumber.isEven(12));
        System.out.println("Number is even = " + evenNumber.isEven(13));
        System.out.println("Number is even = " + evenNumber.isEven(15));
    }

}
