package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_5;

class ComplicatedPercent {

    public double investment (double contribution, double percent, int term ) {
        double V = contribution; // Задаем размер вклада
        double P = percent; // Задаем годовой процент
        int n = term; // задаем срок вклада
        double S = V * Math.pow((1 + P/100), n);
        { return S;}
    }
}
