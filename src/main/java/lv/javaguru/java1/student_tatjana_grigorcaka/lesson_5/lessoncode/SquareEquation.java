package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

class SquareEquation {

    public double findDiscriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public boolean isRoots(int d) {
        if ((d > 0) || (d == 0)) {
            return true;
        } else if (d < 0) {
            return false;
        } else {
            return false;
        }

    }

    public double findFirstRoot(int a, int b, int c, int d) {
            return (double) (-b - Math.sqrt(d)) / (2 * a);
        }

    public double findSecondRoot( int a, int b, int c, int d){
             return (double) (-b + Math.sqrt(d)) / (2 * a);
            }

        }


