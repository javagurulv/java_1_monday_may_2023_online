package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day7;

class BankAccount {
    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }
}
