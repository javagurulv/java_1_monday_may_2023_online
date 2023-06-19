package lv.javaguru.java1.student_timur_geldiev.lesson_3.classwork;

import java.util.Date;

public class FlightTicket {

    public static void main(String[] args){
        PlaneTicket ticket = new PlaneTicket("RIX", "PAR", new Date(999999999999L), new Date(9999999999999L));
        System.out.println(ticket.departureDateTime);
        System.out.println(ticket.arrivalDateTime);

    }
}
