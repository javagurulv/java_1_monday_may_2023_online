package lv.javaguru.java1.student_butrin_ilya.lesson_3.classwork;

public class Family {
    Person Father;
    Person Mather;
    Person Children;

    public Family(Person father, Person mather, Person children) {
        Father = father;
        Mather = mather;
        Children = children;
    }

    public Person getFather() {
        return Father;
    }

    public Person getMather() {
        return Mather;
    }

    public Person getChildren() {
        return Children;
    }
}
