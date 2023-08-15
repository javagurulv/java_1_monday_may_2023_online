package lv.javaguru.java1.student_alexey_kosmachev.lesson_9.workinclass;

import lv.javaguru.java1.teacher.lesson_9_single_responsibility_principle.lessoncode.InsuredSubObject;

import java.util.List;

public class InsuredObject {

    private String name;
    private List<InsuredSubObject> subObjects; // список подъобъектов

    public InsuredObject(String name,
                         List<InsuredSubObject> subObjects) {
        this.name = name;
        this.subObjects = subObjects;
    }

    public String getName() {
        return name;
    }

    public List<InsuredSubObject> getSubObjects() {
        return subObjects;
    }
}
