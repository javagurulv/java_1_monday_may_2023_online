package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_5.homework.day_2;

public class Year {
    public boolean leapYear (int year) {
        if (year % 4 == 0 ) {
            return true;}
        else if (year % 100 == 0) {
            return false;}
        else if (year % 400 == 0) {
            return true;}
        else {
            return false;}
    }
}