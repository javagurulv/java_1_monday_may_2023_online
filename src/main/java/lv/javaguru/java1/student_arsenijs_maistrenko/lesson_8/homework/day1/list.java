package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_8.homework.day1;
import java.util.ArrayList;
import java.util.List;

class list2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        for(int i=0; i<5; i++){
            Integer element = integerList.get(i);
            int value = element.intValue();
            System.out.println(value);
        }
    }
}


