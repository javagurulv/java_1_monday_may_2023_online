package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_5;

class CompoundInterest {

    public double interest (double depositAmount) {

        double annualInterestRate = 0.3;
        double interestAccrualPerYear = 2;
        double depositTerm = 5;

       double sum = (1 + annualInterestRate / interestAccrualPerYear);
            return depositAmount * Math.pow(sum, interestAccrualPerYear * depositTerm);
        }

    }



