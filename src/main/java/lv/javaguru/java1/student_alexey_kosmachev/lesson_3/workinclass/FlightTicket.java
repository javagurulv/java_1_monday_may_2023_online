package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.workinclass;

import java.util.Date;

public class FlightTicket {

    String departure;
    String destination;
    Date datedeparture;
    Date datearrival;

    public FlightTicket(String departure, String destination, Date datedeparture, Date datearrival) {
        this.departure = departure;
        this.destination = destination;
        this.datedeparture = datedeparture;
        this.datearrival = datearrival;
    }
}
