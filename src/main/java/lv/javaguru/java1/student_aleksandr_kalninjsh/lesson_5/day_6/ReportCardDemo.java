package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_6;
class ReportCardDemo {

    public static void main(String[] args) {

        ReportCard reportCard1 = new ReportCard("Konstantin ", "Sidorov ", 7, 6, 8, 5, 9 );
        ReportCard reportCard2 = new ReportCard("Nikita ", "Ignatjuk ", 6, 5, 7, 5, 8);
        System.out.println(reportCard1.name + reportCard1.surname + reportCard1.calculationOfMarks (7, 6, 8, 5, 9));
        System.out.println(reportCard2.name + reportCard2.surname + reportCard2.calculationOfMarks(6, 5, 7, 5, 8));
    }
}
