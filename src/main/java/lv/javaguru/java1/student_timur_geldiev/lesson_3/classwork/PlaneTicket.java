package lv.javaguru.java1.student_timur_geldiev.lesson_3.classwork;

import java.util.Date;

public class PlaneTicket {

    String departure;
    String arrival;
    Date departureDateTime;
    Date arrivalDateTime;

    public PlaneTicket(String departure, String arrival, Date departureDateTime, Date arrivalDateTime){
        this.departure = departure;
        this.arrival = arrival;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
    }
}
