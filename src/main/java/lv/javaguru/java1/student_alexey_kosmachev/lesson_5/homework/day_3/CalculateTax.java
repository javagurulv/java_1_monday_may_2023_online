package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_3;

class CalculateTax {

    public double yourincome (int income) {

        if (income <= 10000) {
            return income / 100 * 30;
           // {return tax1;}
        }
        if ((income > 10000) && (income < 50000)) {
            int reminderof10k = income - 10000;
            int tax10k = 10000 / 100 * 30;
            int taxofReminder = reminderof10k / 100 * 40;
            int tax2 = tax10k + taxofReminder;
            {return tax2;}
        }
        else {
            int reminderof50k = income - 50000;
            int tax10k = 10000 / 100 * 30;
            int tax10_50k = 10000 / 100 * 40;
            int taxofReminder = reminderof50k / 100 * 50;
            int tax3 = tax10k + tax10_50k + taxofReminder;
            {return tax3;}
        }
    }
}
