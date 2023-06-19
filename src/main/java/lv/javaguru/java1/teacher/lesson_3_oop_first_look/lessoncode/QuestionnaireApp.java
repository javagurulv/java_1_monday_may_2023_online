package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

public class QuestionnaireApp {

    public static void main(String[] args) {
        Question questionAboutYourself = new Question("All good?");
        Question questionAboutJavaGuru = new Question("All fine?");
        Questionnaire questionnaire = new Questionnaire("Alex", questionAboutYourself, questionAboutJavaGuru);

        System.out.println(questionnaire.questionOne.questionText);
        System.out.println(questionnaire.questionOne.answer);

        System.out.println(questionnaire.questionTwo.questionText);
        System.out.println(questionnaire.questionTwo.answer);
    }
}
