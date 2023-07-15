package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.lessoncode;

class QuestionnaireApp {
    public static void main(String[] args) {
        Question questionAboutYourself = new Question("All good?");
        Question questionAboutJavaGuru = new Question("All fine?");
        Questionnaire questionnaire = new Questionnaire("Alex",questionAboutYourself, questionAboutJavaGuru);


        System.out.println(questionnaire.questionOne.questionText);
        System.out.println(questionnaire.questionOne.answer);

        System.out.println(questionnaire.questionTwo.questionText);
        System.out.println(questionnaire.questionTwo.answer);
    }

}
