package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_7;

class BankAccount {
   public String owner;
    public int money;

    public BankAccount(String moneyOwner, int moneyAmount) {
        this.owner = moneyOwner;
        this.money = moneyAmount;
    }

    public String getOwner() {
        return owner;
    }

    public int getMoney() {
        return money;
    }
}
