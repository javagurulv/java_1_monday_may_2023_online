package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_8.homework.day4;
import java.util.ArrayList;
import java.util.List;

class list3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add("Object " + i);
        }
        System.out.println("Length: " + list.size());
    }
}
//А миллиард лучше не пытаться
