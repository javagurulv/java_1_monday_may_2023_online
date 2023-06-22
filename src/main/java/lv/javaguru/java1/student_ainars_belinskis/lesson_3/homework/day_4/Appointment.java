package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_4;

public class Appointment {
    private String time1;
    private String time2;

    public Appointment(String time1, String time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public String getTime1 () {return time1;}
    public String getTime2 () {return time2;}
    public void timePeriod(){
        System.out.println(time1 + "-" + time2);
    }



}
