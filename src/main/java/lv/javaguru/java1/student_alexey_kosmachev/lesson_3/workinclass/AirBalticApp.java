package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.workinclass;

import java.util.Date;

class AirBalticApp {
    public static void main(String[] args) {
        FlightTicket testTicket = new FlightTicket("Riga", "Moscow", new Date(), new Date());

        System.out.println(testTicket.datedeparture);
        System.out.println(testTicket.datearrival);
   }
}



