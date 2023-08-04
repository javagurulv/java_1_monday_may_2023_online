package lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1;

public class FraudDetector {

    public boolean isFraud(Transaction t){
        if(t.getTrader().getFullName().equals("Pokemon")){
            return true;
        }
        return false;
    }

    public boolean isMoreThanMillion(Transaction t){
        if(t.getAmount() > 1000000){
            return true;
        }
        return false;
    }

}
