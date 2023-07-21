package lv.javaguru.java1.student_timur_geldiev.lesson_7.homework.day_5;

class Salaries {
    public static void main(String[] args) {

        double[] salaries = new double[]{2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        Salaries sal1 = new Salaries();
        System.out.println("Sigma is: " + sal1.calculateSigma(salaries));
        System.out.println("Total salary expenses is: " + sal1.totalSalaryExpenses(salaries));
        System.out.println("Average salary is: " + sal1.averageSalary(salaries));
        System.out.println("Minimal salary is: " + sal1.minSalary(salaries));
        System.out.println("Maximal salary is: " + sal1.maxSalary(salaries));



    }

    public double totalSalaryExpenses(double[] salaries) {
        double total = 0;
        for (int i = 0; i < salaries.length; i++) {
            total += salaries[i];
        }
        return total;
    }
    public double averageSalary(double[] salaries){
        double avg = 0;
        for (int i = 0; i < salaries.length; i++) {
            avg += salaries[i];
        }
        return (avg / salaries.length);
    }
    public double minSalary(double[] salaries){
        double min = salaries[0];
        for (int i = 0; i<salaries.length; i++){
            double sal = salaries[i];
            if (sal<min){
                min = sal;
            }
        }
        return min;
    }
    public double maxSalary(double[] salaries) {
        double max = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            double sal = salaries[i];
            if (sal > max) {
                max = sal;
            }
        }
        return max;
    }
    public double calculateSigma(double[] salaries){
        double avg = averageSalary(salaries);
        double sqrtSumOfElems = 0;
        for (int i = 0; i <salaries.length; i++){
            sqrtSumOfElems += (salaries[i] - avg) * (salaries[i] - avg);
        }
        return Math.sqrt(sqrtSumOfElems / (salaries.length -1));
    }
}
