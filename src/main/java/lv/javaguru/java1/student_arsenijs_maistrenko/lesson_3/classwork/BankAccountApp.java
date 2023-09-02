package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_3.classwork;

class BankAccountApp {

    public static void main(String[] args) {
        BankAccount alexBankAccount = new BankAccount("Aleksandrs Ivanovs", 51565);
        BankAccount viktorsBankAccount = new BankAccount("Viktors Savonins", 21556);

//        alexBankAccount.owner = "Aleksandrs Ivanovs";
//        alexBankAccount.moneyAmount = 51565;
        System.out.println("Alex Account");
        System.out.println(alexBankAccount.owner);
        System.out.println(alexBankAccount.moneyAmount);

        System.out.println("Viktors Account");
        System.out.println(viktorsBankAccount.owner);
        System.out.println(viktorsBankAccount.moneyAmount);
    }
}
