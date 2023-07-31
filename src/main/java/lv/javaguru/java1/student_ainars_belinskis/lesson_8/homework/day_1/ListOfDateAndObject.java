package lv.javaguru.java1.student_ainars_belinskis.lesson_8.homework.day_1;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class ListOfDateAndObject {
    public static void main(String[] args) {
       ListOfDateAndObject listOfDateAndObject = new ListOfDateAndObject();
        List<ObjectsDate> object1 = new ArrayList<>();

        object1.add(new ObjectsDate("text1", 1));
        object1.add(new ObjectsDate("text2", 2));
        object1.add(new ObjectsDate("text3", 3));

        List<String> texts = new ArrayList<>();
        texts.add("Text1");
        texts.add("Text2");
        texts.add("Text3");

        List<Integer> integers = new ArrayList<>();
        integers.add(45);
        integers.add(55);
        integers.add(67);


        }


}
