package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day5;

public class SalaryTest {
    TotalMinMaxAvarage totalMinMaxAvarage = new TotalMinMaxAvarage();
    public static void main(String[] args) {
        double [] salary = {54400.2, 45553.5, 56306.3, 64830.4, 31000.0};
       SalaryTest test = new SalaryTest();
               test.testAvarage(salary);
               test.testMinSalary(salary);
               test.testMaxSalary(salary);
               test.testTotalSalary(salary);
               test.testSigmaSalary(salary);
    }
    public void testAvarage(double[] salary){
        double realRezult = (54400.2 + 45553.5 + 56306.3 + 64830.4 + 31000.0) / 5;
        double expectedRezult = totalMinMaxAvarage.average(salary);
        checkRezult(realRezult,expectedRezult,"average salary");
    }
    public void testTotalSalary(double[] salary){
        double realRezult = 54400.2 + 45553.5 + 56306.3 + 64830.4 + 31000.0;
        double expectedRezult = totalMinMaxAvarage.totalSalary(salary);
        checkRezult(realRezult,expectedRezult,"TOTAL salary");
    }
    public void testMinSalary(double[] salary){
        double realRezult = 31000.0;
        double expectedRezult = totalMinMaxAvarage.min(salary);
        checkRezult(realRezult,expectedRezult,"MiNIMUM salary");
    }
    public void testMaxSalary(double[] salary){
        double realRezult =  64830.4;
        double expectedRezult = totalMinMaxAvarage.max(salary);
        checkRezult(realRezult,expectedRezult,"MAXIMUM salary");
    }
    public void testSigmaSalary(double[] salary){
        double realRezult = 11480.15;
        double expectedRezult = totalMinMaxAvarage.sigma(salary);
        checkRezult(realRezult,expectedRezult,"TOTAL sigma");
    }

    public void checkRezult (double real, double expected, String titleOfTest){
        if(real == expected) {System.out.println("test " + titleOfTest + " OK");}
        else  {System.out.println("test " + titleOfTest + " fail/ Rezone: real rezult " + real +
                " not equal expected rezult " + expected);}
    }
}
