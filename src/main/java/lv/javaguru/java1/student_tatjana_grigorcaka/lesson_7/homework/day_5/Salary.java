package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_5;

class Salary {

    public double totalSumOfSalary(double[] salary) {
        double sum = 0.0;
        for (double num: salary) {
            sum += num;
        }
        return sum;
    }

    public double maxSumOfSalary(double[] salary) {
        double maxSalary = salary[0];
        for (int i = 0; i < salary.length; i++) {
            double num = salary[i];
            if (num > maxSalary) {
                maxSalary = num;
            }
        }
        return maxSalary;
    }

    public double minSumOfSalary(double[] salary) {
        double minSalary = salary[0];
        for (int i = 0; i < salary.length; i++) {
            double num = salary[i];
            if (num < minSalary) {
                minSalary = num;
            }
        }
        return minSalary;
    }

    public double averageSumOfSalary(double[] salary) {
        double sum = 0.0;
        for (double num: salary) {
            sum += num;
        }
        double average = sum / salary.length;
        return average;
    }
}



