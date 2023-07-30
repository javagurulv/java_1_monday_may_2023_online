package lv.javaguru.java1.student_vitalijs_laksa.lesson_3.classwork;

public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount vladBankAccount = new BankAccount("Vladimir Putin", 1000);
        BankAccount joeBankAccount = new BankAccount("Joe Biden", 2000000);


//        alexBankAccount.owner = "Aleksandrs Ivanovs";
//        alexBankAccount.moneyAmount = 1000;
        System.out.println("Vladimirs Account values are:");
        System.out.println(vladBankAccount.owner);
        System.out.println(vladBankAccount.moneyAmount);

        System.out.println("Joe Account values are:");
        System.out.println(joeBankAccount.owner);
        System.out.println(joeBankAccount.moneyAmount);

    }
}
