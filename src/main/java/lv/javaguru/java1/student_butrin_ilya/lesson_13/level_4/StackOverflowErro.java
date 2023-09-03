package lv.javaguru.java1.student_butrin_ilya.lesson_13.level_4;

public class StackOverflowErro {
    public static void main(String[] args) {
        StackOverflowErro error = new StackOverflowErro();
        error.recussion();
    }
    void recussion(){
        recussion();
    }
}
