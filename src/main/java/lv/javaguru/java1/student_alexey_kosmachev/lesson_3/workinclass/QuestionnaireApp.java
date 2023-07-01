package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.workinclass;

class QuestionnaireApp {
    public static void main(String[] args) {

        Question questionAboutYourself = new Question("Are you ill?");
        Question questionAboutLesson = new Question("Do you follow my mind?");
        Questionare questionare = new Questionare("Alexey", questionAboutLesson, questionAboutYourself);

        questionare.firstQuestion.answer = true;
        System.out.println(questionare.firstQuestion.questionText);
        System.out.println(questionare.firstQuestion.answer);

        System.out.println(questionare.secondQuestion.questionText);
        System.out.println(questionare.secondQuestion.answer);



    }

}
