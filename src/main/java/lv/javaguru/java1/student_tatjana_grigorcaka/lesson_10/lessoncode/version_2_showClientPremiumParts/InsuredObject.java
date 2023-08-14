package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_10.lessoncode.version_2_showClientPremiumParts;


import java.util.List;

class InsuredObject {

    private String name;
    private List<InsuredSubObject> subObjects;

    public InsuredObject(String name, List<InsuredSubObject> subObjects) {

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
