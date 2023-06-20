package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3;
//task 1-4
public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount alexBankAccount = new BankAccount("Aleksandrs Ivanovs", 1000);
        BankAccount viktorsBankAccount = new BankAccount("Viktors Savonins", 2000000);

//        alexBankAccount.owner = "Aleksandrs Ivanovs";
//        alexBankAccount.moneyAmount = 1000;

        System.out.println("Alex Account values are:");
        System.out.println(alexBankAccount.getOwner());
        System.out.println(alexBankAccount.getMoneyAmount());

        System.out.println("Viktors Account values are:");
        System.out.println(viktorsBankAccount.getOwner());
        System.out.println(viktorsBankAccount.getMoneyAmount());
    }
}
