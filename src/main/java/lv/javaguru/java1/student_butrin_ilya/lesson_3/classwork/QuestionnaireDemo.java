package lv.javaguru.java1.student_butrin_ilya.lesson_3.classwork;

public class QuestionnaireDemo {
    public static void main(String[] args) {


        Answer answer1 = new Answer("Are you IlyA?", true);
        Answer answer2 = new Answer("Do you like coffe?", false);
        Questionnaire Ilya = new Questionnaire("ilya", answer1, answer2);
        Questionnaire Andrey = new Questionnaire("Andrey", answer1, answer2);
System.out.println(Ilya.getQuestion1().getText());
System.out.println(Ilya.getQuestion1().isAnswer());


    }
}