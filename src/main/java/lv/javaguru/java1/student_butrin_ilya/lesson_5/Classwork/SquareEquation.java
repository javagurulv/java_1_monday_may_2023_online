package lv.javaguru.java1.student_butrin_ilya.lesson_5.Classwork;

public class SquareEquation {

    public double discriminant (int a, int b, int c){

        double discriminant = (b * b) - (4 * a * c);
        return discriminant;
    }
    public boolean isRoot (int a, int b, int c){
       return  (((b * b) - (4 * a * c)) < 0) ? false : true;
    }

    public double firstRoot (int a, int b, int c){
        double firstRoot = (-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2d * a);
        return firstRoot;
    }
    public double secondRoot (int a, int b, int c){
        double secondRoot = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2d * a);
        return secondRoot;
    }
}
