package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day1;

    public class TriangleSquare {

        public double calculateSquare(int a, int b, int c) {
            double s = calculateSemiPerimeter(a, b, c);
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public double calculateSemiPerimeter(int a, int b, int c) {
            return (a + b + c) / (double) 2;
        }

    }

