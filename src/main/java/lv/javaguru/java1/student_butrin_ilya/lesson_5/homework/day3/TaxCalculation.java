package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day3;

 class TaxCalculation {
     public int calculateTax(int salary) {
         int tax = 0;
         if (salary > 0 && salary < 10000) tax = salary / 100 * 30;
         else if (salary >= 10000 && salary < 50000) tax = ((salary - 10000) / 100 * 30) + (10000 / 100 * 20);
         else if (salary >= 50000)  tax = ((salary - 50000 ) / 100 * 50) + (40000 / 100 * 30) + (10000 / 100*20);
return tax;
     }

}
