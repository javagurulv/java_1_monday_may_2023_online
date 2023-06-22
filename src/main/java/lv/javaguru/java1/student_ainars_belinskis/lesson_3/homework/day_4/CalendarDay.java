package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_4;

class CalendarDay {
    int day;
    int month;
    int year;

    public CalendarDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void dayMonYer(){
        System.out.println(day + "." + month + "." + year);
    }

    public int getDay () {return day;}
    public int getMonth() {return month;}
    public int getYear() {return year;}

}
