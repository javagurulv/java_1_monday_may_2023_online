package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.workinclass;

class BankAccount {
   private String owner;
   private int moneyAmount;

   public BankAccount(String Owner, int MoneyAmount) {
       this.owner = Owner;
       this.moneyAmount = MoneyAmount;

   }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String Owner) {
       this.owner = owner;

    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;

    }
}
