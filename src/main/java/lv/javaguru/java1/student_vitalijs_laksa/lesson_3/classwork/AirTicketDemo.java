package lv.javaguru.java1.student_vitalijs_laksa.lesson_3.classwork;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AirTicketDemo {
    public static void main(String[] args) {
        Calendar air1 = new GregorianCalendar(2022, 2 , 12, 15, 35);
        Calendar air2  = new GregorianCalendar(2022, 3,15, 05, 40);
        AirTicket air = new AirTicket("Riga", "Tallin", air1.getTime(), air2.getTime());
  System.out.println(air.getTimeDateStart());
  System.out.println(air.getTimeDateFinish());
    }

}
