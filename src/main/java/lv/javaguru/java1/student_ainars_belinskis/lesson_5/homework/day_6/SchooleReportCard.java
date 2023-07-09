package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_6;

class SchooleReportCard {
    String name;
    String lastName;
    int subject1;
    int subject2;
    int subject3;
    int subject4;
    int subject5;

    public SchooleReportCard(String name, String lastName, int subject1, int subject2, int subject3, int subject4, int subject5) {
        this.name = name;
        this.lastName = lastName;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
    }

    public double SchooleReportCardRating(int subject1, int subject2, int subject3, int subject4, int subject5) {
        return (subject1 + subject2 + subject3 + subject4 + subject5) / (double) 5;
    }


}

