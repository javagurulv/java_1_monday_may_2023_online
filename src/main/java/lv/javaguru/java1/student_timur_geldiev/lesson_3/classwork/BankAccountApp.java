package lv.javaguru.java1.student_timur_geldiev.lesson_3.classwork;

public class BankAccountApp {
    public static void main(String[] args){
      /*  BankAccount account1 = new BankAccount();
        account1.owner = "John Smith";
        account1.amountOfMoney = 100;
        System.out.println("This account owner is " + account1.owner + "\nAnd amount of money on bank account is " + account1.amountOfMoney);

        BankAccount account2 = new BankAccount();
        account2.owner = "Jane Smith";
        account2.amountOfMoney = 999;
        System.out.println("This account owner is " + account2.owner + "\nAnd amount of money on bank account is " + account2.amountOfMoney); */

       /* BankAccount account3 = new BankAccount();
        account3.setOwner("Petja");
        account3.setAmountOfMoney(333);
        System.out.println("This account owner is " + account3.getOwner() + "\nAnd amount of money on bank account is " + account3.getAmountOfMoney()); */

        BankAccount account4 = new BankAccount("Samantha Jones", 40);
        System.out.println("This account owner is " + account4.getOwner() + "\nAnd amount of money on bank account is " + account4.getAmountOfMoney());


    }
}
