package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

import java.util.Date;

public class AirBalticApp {

    public static void main(String[] args) {
        FlightTicket testTicket = new FlightTicket("RIX", "ABC", new Date(), new Date());

        System.out.println(testTicket.departureDateTime);
        System.out.println(testTicket.arrivalDateTime);
    }
}
