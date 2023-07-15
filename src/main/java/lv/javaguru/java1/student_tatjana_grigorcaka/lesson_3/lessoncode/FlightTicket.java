package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.lessoncode;

import java.util.Date;

class FlightTicket {

    String departure;
    String destination;
    public Date departureDateTime;
    public Date arrivalDateTime;

    public FlightTicket(String departure, String destination, Date departureDateTime, Date arrivalDateTime) {
        this.departure = departure;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
    }

}
