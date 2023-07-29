package lv.javaguru.java1.student_timur_geldiev.lesson_8.homework.day_1;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        ObjectExample obj1 = new ObjectExample("Text1", 1);
        ObjectExample obj2 = new ObjectExample("Text2", 2);
        ObjectExample obj3 = new ObjectExample("Text3", 3);

        List<ObjectExample> exampleList = new ArrayList<>();

        exampleList.add(obj1);
        exampleList.add(obj2);
        exampleList.add(obj3);

        List<String> textList = new ArrayList<>();
        textList.add("SomeText");
        textList.add("AnotherText");

        List<Integer> intsList = new ArrayList<>();
        intsList.add(1);
        intsList.add(2);
        intsList.add(3);




    }
}
