package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.workinclass;

class Questionare {

    String name;
    Question firstQuestion;
    Question secondQuestion;

    public Questionare(String name, Question one, Question two) {
        this.name = name;
        this.firstQuestion = one;
        this.secondQuestion = two;
    }

}
