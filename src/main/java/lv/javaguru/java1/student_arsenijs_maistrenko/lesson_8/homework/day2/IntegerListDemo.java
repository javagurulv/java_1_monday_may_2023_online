package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_8.homework.day2;
import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(1);
        integerList.add(3);
        integerList.add(6);
        integerList.add(5);
        integerList.add(10);
        integerList.add(0, 2);
        int listLength = integerList.size();
        System.out.println("Length: " + listLength);
        integerList.remove(0);
        integerList.remove(Integer.valueOf(10));
        boolean isEmpty = integerList.isEmpty();
        System.out.println("Empty? " + isEmpty);

        System.out.println("Content:");
        for (Integer num : integerList) {
            System.out.println(num);
        }
    }
}

