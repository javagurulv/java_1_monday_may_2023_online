package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_3;

class SalaryTaxApp {
    public static void main(String[] args) {
       SalaryTax salaryTax = new SalaryTax();

       System.out.println("Tax payable:" + salaryTax.SalaryTaxCalculator(15000));
       System.out.println("Tax payable:" + salaryTax.SalaryTaxCalculator(9097));
       System.out.println("Tax payable:" + salaryTax.SalaryTaxCalculator(45678));
       System.out.println("Tax payable:" + salaryTax.SalaryTaxCalculator(5678990));
       System.out.println("Tax payable:" + salaryTax.SalaryTaxCalculator(0));
       System.out.println("Tax payable:" + salaryTax.SalaryTaxCalculator(1));
       System.out.println("Tax payable:" + salaryTax.SalaryTaxCalculator(-10));

    }
}
