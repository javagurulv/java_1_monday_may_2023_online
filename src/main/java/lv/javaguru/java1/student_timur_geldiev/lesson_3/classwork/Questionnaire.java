package lv.javaguru.java1.student_timur_geldiev.lesson_3.classwork;

public class Questionnaire {
    String name;
    Question questionOne;
    Question questionTwo;

    public Questionnaire(String name, Question questionOne, Question questionTwo){
        this.name = name;
        this.questionOne = questionOne;
        this.questionTwo = questionTwo;
    }
}
