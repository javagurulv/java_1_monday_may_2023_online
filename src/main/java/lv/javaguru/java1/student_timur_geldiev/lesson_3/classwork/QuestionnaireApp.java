package lv.javaguru.java1.student_timur_geldiev.lesson_3.classwork;


public class QuestionnaireApp {

    public static void main(String[] args) {
        Question questionAboutYourself = new Question("All good?");
        Question questionAboutJavaGuru = new Question("All fine?");
        Questionnaire questionnaire = new Questionnaire("John", questionAboutJavaGuru, questionAboutYourself);
        questionAboutJavaGuru.answer = true;

        System.out.println(questionnaire.questionOne.questionText);
        System.out.println(questionnaire.questionOne.answer);

        System.out.println(questionnaire.questionTwo.questionText);
        System.out.println(questionnaire.questionTwo.answer);
    }
}
