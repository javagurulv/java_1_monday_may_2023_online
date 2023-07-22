package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day5;

import static java.lang.Math.round;

public class TotalMinMaxAvarage {
    public double totalSalary (double[] salary){
        double sum = 0;
        for (double s : salary) {
            sum = sum + s;
        }
        return sum;
    }
    public double min (double[] salary){
        double min = salary[0];
        for (double s : salary) {
         if(s < min) {min = s;}
        }
        return min;
    }
    public double max (double[] salary){
        double max = salary[0];
        for (double s : salary) {
            if(s > max) {max = s;}
        }
        return max;
    }
    public double average (double[] salary){
        double total = totalSalary(salary);
        double quantity = salary.length;
        return total/quantity;
    }
    public double sigma (double[] salary){
        double average = average(salary);
        double [] massiv = new double[5];
        for (int i = 0; i < salary.length; i++){
            double squareOfTheDifference = ((salary[i]*salary[i]) - (2 * average * salary[i]) + (average * average));
            massiv[i] = squareOfTheDifference;}
        double averageMassiv = average(massiv);
        double sigma = Math.sqrt(averageMassiv);
        return round(sigma*100.0) / 100.0;


    }
}
