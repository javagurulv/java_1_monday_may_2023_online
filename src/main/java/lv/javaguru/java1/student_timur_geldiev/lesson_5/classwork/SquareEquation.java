package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

class SquareEquation {
    double D;
    double a;
    double b;
    double c;

    public double findDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public boolean isItRoots() {
        D = findDiscriminant();
        if (D < 0) {
            System.out.println("No roots");
            return false;
        } else if (D == 0) {
            System.out.println("There is one root");
            return true;

        } else {
            System.out.println("There is two roots");
            return true;
        }

    }

    public double findFirstRoot() {
        return (-b + Math.sqrt(D)) /(double) 2 * a;

    }

    public double findSecondRoot() {
        return (-b - Math.sqrt(D)) / (double) 2 * a;

    }

    public SquareEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


}
