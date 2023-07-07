package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_7;

public class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return owner;
    }

    int getMoney() {
        return money;
    }
}
