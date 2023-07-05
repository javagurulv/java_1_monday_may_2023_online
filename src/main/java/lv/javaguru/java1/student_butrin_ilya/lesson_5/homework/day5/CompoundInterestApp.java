package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day5;

public class CompoundInterestApp {
    public static void main(String[] args) {


        CompoundInterest compoundInterest = new CompoundInterest();
        System.out.println(compoundInterest.calculateCompoundInterest(10000, 12,10,8));
        System.out.println(compoundInterest.calculateCompoundInterest(100000, 12,7,2));
    }
}