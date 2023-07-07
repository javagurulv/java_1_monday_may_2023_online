package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_6;

public class SchooleReportCardApp {
    public static void main(String[] args) {
        SchooleReportCard student1 = new SchooleReportCard("Ainars", "Belinskis", 5, 4,5,4,5);
        SchooleReportCard student2 = new SchooleReportCard("Robert", "Hupenia", 4, 5, 3, 4,3);
        SchooleReportCard student3 = new SchooleReportCard("Viktors", "Servut", 5,5,5,5,5);

        System.out.println("Avarege " + student1.name + " " + student1.lastName + " rating  = " + student1.SchooleReportCardRating(student1.subject1, student1.subject2, student1.subject3, student1.subject4, student1.subject5));
        System.out.println("Avarege " + student2.name + " " + student2.lastName + " rating  = " + student2.SchooleReportCardRating(student2.subject1, student2.subject2, student2.subject3, student2.subject4, student2.subject5));
        System.out.println("Avarege " + student3.name + " " + student3.lastName + " rating  = " + student3.SchooleReportCardRating(student3.subject1, student3.subject2, student3.subject3, student3.subject4, student3.subject5));

    }
}
