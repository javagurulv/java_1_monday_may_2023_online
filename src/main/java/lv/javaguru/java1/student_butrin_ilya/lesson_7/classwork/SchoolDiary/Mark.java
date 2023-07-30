package lv.javaguru.java1.student_butrin_ilya.lesson_7.classwork.SchoolDiary;

public class Mark {
    int mark;
    String objekt;

    public Mark( String objekt,int mark) {
        this.mark = mark;
        this.objekt = objekt;
    }

    public int getMark() {
        return mark;
    }

    public String getObjekt() {
        return objekt;
    }
}
