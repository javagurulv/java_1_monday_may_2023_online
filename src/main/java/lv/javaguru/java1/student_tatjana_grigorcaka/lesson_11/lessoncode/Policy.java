package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode;


import java.util.List;

public class Policy {

    private String number;
    private PolicyStatus policyStatus;
    private List<InsuredObject> objects;

    public Policy(String number, PolicyStatus policyStatus, List<InsuredObject> objects) {
        this.number = number;
        this.policyStatus = policyStatus;
        this.objects = objects;
    }

    public String getNumber() { return number; }

    public PolicyStatus getPolicyStatus() { return policyStatus; }

    public List<InsuredObject> getObjects() { return objects; }

}