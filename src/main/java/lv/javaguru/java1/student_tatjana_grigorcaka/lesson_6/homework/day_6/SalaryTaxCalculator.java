package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_6;

class SalaryTaxCalculator {

    public double calculateZeroTax1(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        }
        return tax;
    }

    public double calculate30Tax2(double salary) {
        double tax = 0;
        if ((salary > 0) && (salary <= 10000)) {
           tax = (salary / 100) * 30;
        }
        return tax;
    }

    public double calculate40Tax3(double salary) {
        double tax = 0;
        if ((salary > 10000) && (salary <= 50000)) {
             tax = 3000 + (((salary - 10000) / 100) * 40);
        }
        return tax;
    }

    public double calculate50Tax4(double salary) {
        double tax = 0;
        if (salary > 50000) {
             tax = 19000 + (((salary - 50000) / 100) * 50);
        }
        return tax;
    }

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            tax = (salary / 100) * 30;
        } else if ((salary >= 10000) && (salary < 50000)) {
            tax = 3000 + (((salary - 10000) / 100) * 40);
        } else if (salary >= 50000) {
            tax = 19000 + (((salary - 50000) / 100) * 50);
        } else { return tax;

        }
        return tax;
    }

}




