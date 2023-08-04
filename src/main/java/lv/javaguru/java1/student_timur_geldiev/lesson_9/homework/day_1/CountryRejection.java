package lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1;

public class CountryRejection {

    public boolean isSydneyTrader(Transaction t){
        if(t.getTrader().getCity().equals("Sydney")){
            return true;
        }
        return false;
    }

    public boolean isJamaica(Transaction t){
        if (t.getTrader().getCountry().equals("Jamaica")){
            return true;
        }
        return false;
    }
    public boolean isGermanyAndMoreThanThousand(Transaction t){
        if (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000){
            return true;
        }
        return false;
    }
}
