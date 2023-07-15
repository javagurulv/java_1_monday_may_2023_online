package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.lessoncode;


import java.util.Date;

class AirBalticApp {
    public static void main(String[] args) {
        FlightTicket testTicket = new FlightTicket("RIX", "ABC", new Date(), new Date());

                System.out.println(testTicket.departureDateTime);
                System.out.println(testTicket.arrivalDateTime);




    }


}
