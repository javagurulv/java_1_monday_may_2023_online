package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_8.homework.day3;
import java.util.ArrayList;
import java.util.List;

class list2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");

        System.out.println("Список с дубликатами:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}


