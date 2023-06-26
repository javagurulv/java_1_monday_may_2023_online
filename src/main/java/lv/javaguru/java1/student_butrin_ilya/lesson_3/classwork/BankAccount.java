package lv.javaguru.java1.student_butrin_ilya.lesson_3.classwork;

 class BankAccount {

     String owner;
     int moneyAmmound;

     public BankAccount(String owner, int moneyAmmound) {
         this.owner = owner;
         this.moneyAmmound = moneyAmmound;
     }

     public String getOwner() {
         return owner;
     }

     public int getMoneyAmmound() {
         return moneyAmmound;
     }

     public void setOwner(String owner) {
         this.owner = owner;
     }

     public void setMoneyAmmound(int moneyAmmound) {
         this.moneyAmmound = moneyAmmound;
     }
 }