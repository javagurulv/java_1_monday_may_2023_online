package lv.javaguru.java1.student_timur_geldiev.lesson_7.homework.day_4;


import java.util.ArrayList;
import java.util.List;

class SalesCounter {

    public static void main(String[] args) {

        Check check1 = new Check(1, 19.54);
        Check check2 = new Check(2, 5);
        Check check3 = new Check(3, 25.29);
        Check check4 = new Check(4, 33.03);

        List<Check> checks = new ArrayList<>();
        checks.add(check1);
        checks.add(check2);
        checks.add(check3);
        checks.add(check4);

        List<Check> emptyChecksList = new ArrayList<>();


        SalesCounter test = new SalesCounter();
        test.findSumTest(checks);
        test.findAverageTest(checks);
        test.checkEmptyList(emptyChecksList);


    }

    public double findSum(List<Check> allBuys) {
        double sum = 0;
        for (int i = 0; i < allBuys.size(); i++) {
            Check check = allBuys.get(i);
            sum += check.getBuySum();
        }
        return sum;
    }

    public double findAverage(List<Check> allSum) {
        if (allSum == null || allSum.isEmpty()) {
            return 0;
        }
        double totalSum = 0;
        for (int i = 0; i < allSum.size(); i++) {
            Check check = allSum.get(i);
            totalSum += check.getBuySum();

        }
        return totalSum / allSum.size();


    }

    public void findSumTest(List<Check> checks) {
        SalesCounter test1 = new SalesCounter();
        double expected = 82.86;
        double actual = test1.findSum(checks);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " expected result: " + expected + " not equal actual result: " + actual);
        }
    }

    public void findAverageTest(List<Check> checks) {
        SalesCounter test2 = new SalesCounter();
        double expected = 20.715;
        double actual = test2.findAverage(checks);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " expected result: " + expected + " not equal actual result: " + actual);
        }

    }
    public void checkEmptyList(List<Check> emptyChecksList){
        SalesCounter test3 = new SalesCounter();
        double expected = 0;
        double actual = test3.findSum(emptyChecksList);
        if (actual == expected){
            System.out.println("Pass");
        }else{
            System.out.println("Fail" + " expected result: " + expected + " not equal actual result: " + actual);
        }
    }

}
