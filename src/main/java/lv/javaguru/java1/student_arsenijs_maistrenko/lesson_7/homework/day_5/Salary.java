package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_7.homework.day_5;

class Salary {
    public double sumTotalSalaryExpenses(double[] salaries) {
        double totalSalary = 0.0;
        for (int i = 0; i < salaries.length; i++) {
            totalSalary += salaries[i];
        }
        return totalSalary;
    }

    public double findMaxSumOfSalary(double[] salaries) {
        if (salaries.length == 0) {
            return 0.0;
        } else {
            double maxSalary = salaries[0];
            for (int i = 0; i < salaries.length; i++) {
                double num = salaries[i];
                if (num > maxSalary) {
                    maxSalary = num;
                }
            }
            return maxSalary;
        }
    }

    public double findMinSumOfSalary(double[] salaries){
        if (salaries.length == 0) {
            return 0.0;
        } else {
            double minSalary = salaries[0];
            for (int i = 0; i < salaries.length; i++) {
                double num = salaries[i];
                if (num < minSalary) {
                    minSalary = num;
                }
            }
            return minSalary;
        }
    }

    public double calculateAverageSumOfSalary(double[] salaries){
        double totalSalary = sumTotalSalaryExpenses(salaries);
        if (salaries.length == 0) {
            return 0.0;
        } else {
            return totalSalary / salaries.length;
        }
    }}