package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_13.libdomainmodel;

import java.util.Date;

public class Notifications {

    private NotificationType type;
    private ReaderTicketItem readerTicketItem;

    private Client client;

    private Date sentDate;

}


enum NotificationType{

    SMS, EMAIL, PHONE_CALL
}
