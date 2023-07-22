package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_2;

// Найдите логическую ошибку в программе и исправьте её:
class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // необходимы плюсы. При минусах процесс бесконечный, нет нижней границы
            System.out.println(i);
        }
    }
}
