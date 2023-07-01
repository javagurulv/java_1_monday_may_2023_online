package lv.javaguru.java1.student_alexey_kosmachev.lesson_2.workinclass;

class CalculateTime {
    //привести колличество секунд 3665 в формате часы:минуты:секунды
    public static void main(String[]args) {
        //секунд в минуте
        int minuta = 60;
        int hour = 60 * minuta;

        //количество часов без остатка в данном по условию числе 3665
        int chasi = 3665/hour;
        // оставшееся колличество секунд
        int ostatok = 3665 - hour;
        //количество минут без остатка после предыдущих операций
        int minuti = ostatok/minuta;
        //количество секунд после всех операций
        int secundi = ostatok - minuta;

        System.out.println("Время = " + chasi + ":" + minuti + ":" +secundi);





    }
}
