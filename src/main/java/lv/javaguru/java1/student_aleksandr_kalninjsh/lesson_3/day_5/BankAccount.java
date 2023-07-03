package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_5;

public class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName,
                int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return ownerFirstName;
    }

    String getOwnerLastName() {
        return ownerLastName;
    }

    int getMoneyAmount() {
        return moneyAmount;
    }

}
