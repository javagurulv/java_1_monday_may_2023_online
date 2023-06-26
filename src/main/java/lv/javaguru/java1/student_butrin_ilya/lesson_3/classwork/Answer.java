package lv.javaguru.java1.student_butrin_ilya.lesson_3.classwork;

public class Answer {
    String text;
    boolean answer;

    public String getText() {
        return text;
    }

    public boolean isAnswer() {
        return answer;
    }

    public Answer(String text, boolean answer) {
        this.text = text;
        this.answer = answer;

    }
}