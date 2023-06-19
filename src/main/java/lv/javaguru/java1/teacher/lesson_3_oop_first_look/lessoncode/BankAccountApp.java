package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount alexBankAccount = new BankAccount("Aleksandrs Ivanovs", 1000);
        BankAccount viktorsBankAccount = new BankAccount("Viktors Savonins", 2000000);

//        alexBankAccount.owner = "Aleksandrs Ivanovs";
//        alexBankAccount.moneyAmount = 1000;
        System.out.println("Alex Account");
        System.out.println(alexBankAccount.owner);
        System.out.println(alexBankAccount.moneyAmount);

        System.out.println("Viktors Account");
        System.out.println(viktorsBankAccount.owner);
        System.out.println(viktorsBankAccount.moneyAmount);
    }
}
