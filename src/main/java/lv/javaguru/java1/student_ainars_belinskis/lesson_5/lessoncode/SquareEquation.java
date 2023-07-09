package lv.javaguru.java1.student_ainars_belinskis.lesson_5.lessoncode;

class SquareEquation {

    public double Discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;

    }

    public boolean isSquareRoot(int a, int b, int c) {
        return Discriminant(a, b, c) >= 0;
    }

    public double firstRoot(int a, int b, int c) {
        double D = Discriminant(a, b, c);
        return (-b - Math.sqrt(D)) / (2 * a);
    }

    public double secondRoot(int a, int b, int c) {
        double D = Discriminant(a, b, c);
        return (-b + Math.sqrt(D)) / (2 * a);
    }


}

