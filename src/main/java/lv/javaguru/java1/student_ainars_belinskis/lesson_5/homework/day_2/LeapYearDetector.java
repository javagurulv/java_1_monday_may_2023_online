package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_2;

class LeapYearDetector {


    public boolean isLeapYear(int year){
        if (year % 4 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
