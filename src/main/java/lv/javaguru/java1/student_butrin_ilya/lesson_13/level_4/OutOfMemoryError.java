package lv.javaguru.java1.student_butrin_ilya.lesson_13.level_4;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        for (int i=0; 1<1000; i++){
            test.add("ааа" + i);
        System.out.println(test.get(i));}

    }
}
