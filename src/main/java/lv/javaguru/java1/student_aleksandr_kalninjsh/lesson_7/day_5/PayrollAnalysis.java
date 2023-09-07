package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_5;

class PayrollAnalysis {

    public double calculateTotalSalary(double[] salaries) {
        double totalSalary = 0.0;
        for (int i = 0; i < salaries.length; i++) {
            totalSalary += salaries[i];
        }
        return totalSalary;
    }

    public double findMinSalary(double[] salaries) {
        if (salaries.length == 0) {
            return 0.0;
        }else {
            double minSalary = salaries[0];
            for (int i = 0; i < salaries.length; i++) {
                if (minSalary > salaries[i]) {
                    minSalary = salaries[i];
                }
            }
            return minSalary;
        }
    }
    public double findMaxSalary(double[] salaries) {
        if (salaries.length == 0) {
            return 0.0;
        }else {
            double maxSalary = salaries[0];
            for (int i = 0; i < salaries.length; i++) {
                if (maxSalary < salaries[i]) {
                    maxSalary = salaries[i];
                }
            }
            return maxSalary;
        }
    }
    public double calculateAverageSalary(double[] salaries) {
        double totalSalary = calculateTotalSalary(salaries);
        if (salaries.length == 0) {
            return 0.0;
        }else {
            return totalSalary / salaries.length;
        }
    }

    public double calculateSigmaDeviation(double[] salaries) {
        double averageSalary = calculateAverageSalary(salaries);
        double sigma = 0.0;
        for (int i = 0; i < salaries.length; i++) {
            sigma += Math.pow(salaries[i] - averageSalary, 2);
        }
        return Math.sqrt(sigma / salaries.length);


    }



}