package lv.javaguru.java1.student_alexey_kosmachev.lesson_9.workinclass;

import lv.javaguru.java1.teacher.lesson_9_single_responsibility_principle.lessoncode.InsuredObject;
import lv.javaguru.java1.teacher.lesson_9_single_responsibility_principle.lessoncode.InsuredSubObject;
import lv.javaguru.java1.teacher.lesson_9_single_responsibility_principle.lessoncode.Policy;
import lv.javaguru.java1.teacher.lesson_9_single_responsibility_principle.lessoncode.PolicyStatus;
import lv.javaguru.java1.teacher.lesson_9_single_responsibility_principle.lessoncode.RiskType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PolicyCreatorExample {

    public static void main(String[] args) {
        InsuredSubObject tv = new InsuredSubObject(
                "TV",
                new BigDecimal("1000.50"),
                List.of(RiskType.FIRE)
        );
        InsuredSubObject fridge = new InsuredSubObject(
                "FRIDGE",
                new BigDecimal("500.00"),
                List.of(RiskType.FIRE, RiskType.THEFT)
        );

        List<InsuredSubObject> subObjects = new ArrayList<>();
        subObjects.add(tv);
        subObjects.add(fridge);

        InsuredObject object1 = new InsuredObject(
                "House 1",
                subObjects
        );
        List<InsuredObject> objects = new ArrayList<>();
        objects.add(object1);

        Policy policy = new Policy(
                "LV-1",
                PolicyStatus.REGISTERED,
                objects
        );

        System.out.println("sdsdfds");


    }

}
