package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_1;

import java.util.ArrayList;
import java.util.List;

// Получилось вывести ссылки в List
public class ListLinkDataTypesApp {

    public static void main(String[] args) {
        ListLinkDataTypesObject object1 = new ListLinkDataTypesObject("text1", 12);
        ListLinkDataTypesObject object2 = new ListLinkDataTypesObject("text2", 7);
        ListLinkDataTypesObject object3 = new ListLinkDataTypesObject("text3", 10);

        List<String> textObject = new ArrayList<>();
            textObject.add(object1.getText());
            textObject.add(object2.getText());
            textObject.add(object3.getText());

        List<Integer> numberObject = new ArrayList<>();
            numberObject.add(object1.getNumber());
            numberObject.add(object2.getNumber());
            numberObject.add(object3.getNumber());

        System.out.println("Show Text: " + textObject);
        System.out.println("Show Number: " + numberObject);

    }
}
