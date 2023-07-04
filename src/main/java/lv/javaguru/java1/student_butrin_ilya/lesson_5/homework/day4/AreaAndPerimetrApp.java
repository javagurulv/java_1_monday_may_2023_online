package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day4;

public class AreaAndPerimetrApp {
    public static void main(String[] args) {
        AreaCircle area = new AreaCircle();
        PerimetrCircle perimetr  = new PerimetrCircle();
        System.out.println("Area = " + area.calculateArea(500));
        System.out.println("perimetr = " + perimetr.calculatePerimetr(500));
    }
}
