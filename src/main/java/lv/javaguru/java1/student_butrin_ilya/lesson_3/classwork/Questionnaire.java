package lv.javaguru.java1.student_butrin_ilya.lesson_3.classwork;

import lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode.Question;

public class Questionnaire {
    String name;
    Answer question1;
    Answer question2;

    public String getName() {
        return name;
    }

    public Answer getQuestion1() {
        return question1;
    }

    public Answer getQuestion2() {
        return question2;
    }

    public Questionnaire(String name, Answer question1, Answer question2) {
        this.name = name;
        this.question1 = question1;
        this.question2 = question2;

    }
}

