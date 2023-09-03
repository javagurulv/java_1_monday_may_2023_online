package lv.javaguru.java1.student_butrin_ilya.lesson_13.level_3;

import java.math.BigDecimal;

public class NullPointerExceptionDemo {
    public static void main(String[] args) throws NullPointerException {
        try {
            Integer x = null;
            System.out.println(x.toString());
        }
        catch (NullPointerException e) {System.err.println("не порядочек");}


    }
}
