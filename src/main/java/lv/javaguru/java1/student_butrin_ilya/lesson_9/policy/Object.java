package lv.javaguru.java1.student_butrin_ilya.lesson_9.policy;

import java.util.List;

public class Object {
    String name;
    List <SubObject> subObject;

    public Object(String name, List<SubObject> subObject) {
        this.name = name;
        this.subObject = subObject;
    }

    public List<SubObject> getSubObject() {
        return subObject;
    }
}


