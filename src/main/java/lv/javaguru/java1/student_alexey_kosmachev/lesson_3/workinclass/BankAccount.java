package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.workinclass;

public class BankAccount {
   private String owner;
   private int moneyAmount;

   public BankAccount(String Owner, int MoneyAmount) {
       this.owner = Owner;
       this.moneyAmount = MoneyAmount;

   }
    public String getOwner() {
        return owner;
    }
    public int getMoneyAmount() {
        return moneyAmount;
    }
}
