package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day2;

class LeapYear {
    boolean rezult;
    public boolean checkYearIsleap (int year){
        if (year % 4 !=0 ) {rezult = false;}
        else if (year % 100 != 0) { rezult = true;}
        else if (year % 400 == 0) {rezult = true;}
        else rezult = false;
        return rezult;
    }
}


