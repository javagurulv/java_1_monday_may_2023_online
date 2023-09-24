package lv.javaguru.java1.student_butrin_ilya.lesson_9.homework;

import java.util.List;
import java.util.Optional;

public class FraudDetector {
    FraudDetectionResult isFraud(List<FraudRule> fraudRule, Transaction transaction) {
        int i;
        boolean rezult = true;
        FraudDetectionResult rez = new FraudDetectionResult(rezult, null);
        for(i=0; i<fraudRule.size();i++){
            if (!fraudRule.get(i).isFraud(transaction)){
                rez.setFraud(false);
                rez.setRuleName(fraudRule.get(i).getRuleName());
                break;}
        }
        return rez;
    }
}
