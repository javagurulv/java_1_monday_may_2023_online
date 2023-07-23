package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_6;

class ReportCard {

    String name;
    String surname;
    int algebra;
    int geometry;
    int physics;
    int chemistry;
    int english;

    public ReportCard (String name, String surname, int algebra, int geometry, int physics, int chemistry, int english) {
        this.name = name;
        this.surname = surname;
        this.algebra = algebra;
        this.geometry = geometry;
        this.physics = physics;
        this.chemistry = chemistry;
        this.english = english;
    }
    public double calculationOfMarks(int algebra, int geometry, int physics, int chemistry, int english) {
        return  (algebra + geometry + physics + chemistry + english) / (double) 5;

    }


}
