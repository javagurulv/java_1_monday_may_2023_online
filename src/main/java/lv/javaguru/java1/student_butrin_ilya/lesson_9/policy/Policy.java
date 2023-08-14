package lv.javaguru.java1.student_butrin_ilya.lesson_9.policy;

import java.util.List;

public class Policy {

    String number;
    StatusPolicy status;
    List<Object> object;

    public Policy(String number, StatusPolicy status, List<Object> object) {
        this.number = number;
        this.status = status;
        this.object = object;
    }

    public String getNumber() {
        return number;
    }

    public StatusPolicy getStatus() {
        return status;
    }

    public List<Object> getObject() {
        return object;
    }
}
