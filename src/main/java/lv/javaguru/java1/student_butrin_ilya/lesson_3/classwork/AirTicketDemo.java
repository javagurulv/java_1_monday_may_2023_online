package lv.javaguru.java1.student_butrin_ilya.lesson_3.classwork;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AirTicketDemo {
    public static void main(String[] args) {
        Calendar air1 = new GregorianCalendar((2017, 0 , 25, 20, 30);
        Calendar air2  = new GregorianCalendar(2012, 3,13, 20, 40);
        AirTicket air = new AirTicket("Moskva", "spb", air1.getTime(), air2.getTime());
  System.out.println(air.getTimeDateStart());
  System.out.println(air.getTimeDateFinish());
    }

}
