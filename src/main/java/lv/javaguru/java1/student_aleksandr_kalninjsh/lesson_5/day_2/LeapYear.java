package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_2;

class LeapYear {

    public boolean isLeapYear (int year) {

        if (year % 4 != 0 ) {
            return false;
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }


}
