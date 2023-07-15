package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.lessoncode;

class Questionnaire {
    String name;
    Question questionOne;
    Question questionTwo;

//constructor

    public Questionnaire(String name, Question questionOne, Question questionTwo)  {
        this.name = name;
        this.questionOne = questionOne;
        this.questionTwo = questionTwo;

    }
}
