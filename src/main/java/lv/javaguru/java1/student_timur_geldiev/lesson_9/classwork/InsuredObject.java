package lv.javaguru.java1.student_timur_geldiev.lesson_9.classwork;

import java.util.List;

public class InsuredObject {

    private String name;

    private List<InsuredSubObject> insuredSubObjects;


    public InsuredObject(String name, List<InsuredSubObject> insuredSubObjects) {
        this.name = name;
        this.insuredSubObjects = insuredSubObjects;
    }

    public String getName() {
        return name;
    }

    public List<InsuredSubObject> getSubObjects() {
        return insuredSubObjects;
    }
}
