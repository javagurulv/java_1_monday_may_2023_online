package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.lessoncode;
//task 1-5
public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount alexBankAccount = new BankAccount("Alex Ivanov", 1000);
        BankAccount viktorsBankAccount = new BankAccount("Viktors Savonins", 2000000);

//        alexBankAccount.owner = "Aleksandrs Ivanovs";
//        alexBankAccount.moneyAmount = 1000;

        System.out.println("Alex Account values are:");
        System.out.println(alexBankAccount.getOwner());
        System.out.println(alexBankAccount.getMoneyAmount());

        String tempVariable = alexBankAccount.getOwner();
        int alexBankAccountMoneyAmount = alexBankAccount.getMoneyAmount();
        System.out.println(alexBankAccountMoneyAmount);

        System.out.println("Viktors Account values are:");
        System.out.println(viktorsBankAccount.getOwner());
        System.out.println(viktorsBankAccount.getMoneyAmount());
    }
}
