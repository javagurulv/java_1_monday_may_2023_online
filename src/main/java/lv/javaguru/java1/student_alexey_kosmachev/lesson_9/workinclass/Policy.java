package lv.javaguru.java1.student_alexey_kosmachev.lesson_9.workinclass;

import lv.javaguru.java1.teacher.lesson_9_single_responsibility_principle.lessoncode.InsuredObject;
import lv.javaguru.java1.teacher.lesson_9_single_responsibility_principle.lessoncode.PolicyStatus;

import java.util.List;

public class Policy {

    private String number;
    private PolicyStatus policyStatus;
    private List<InsuredObject> objects; //список объектов

    public Policy(String number,
                  PolicyStatus policyStatus,
                  List<InsuredObject> objects) {
        this.number = number;
        this.policyStatus = policyStatus;
        this.objects = objects;
    }

    public String getNumber() {
        return number;
    }

    public PolicyStatus getPolicyStatus() {
        return policyStatus;
    }

    public List<InsuredObject> getObjects() {
        return objects;
    }
}
