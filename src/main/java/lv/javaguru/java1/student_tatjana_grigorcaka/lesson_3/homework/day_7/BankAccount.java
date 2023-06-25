package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_7;

public class BankAccount {

    String owner;
    int moneyAmount;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.moneyAmount = moneyAmount;
       }

    String getOwner() {
        return owner;
    }

    int getMoney() {
        return moneyAmount;
    }
}
